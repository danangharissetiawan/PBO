package com.risset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class FormNilaiMhs extends JFrame {

    DefaultTableModel table1;
    Object[] list_mhs = new Object[9];
    int x = 0;
    DBConnection dbCon = new DBConnection();
    Connection con = dbCon.getConnection();

    private JTextField inputNim;
    private JLabel labelNim;
    private JTextField inputNama;
    private JTextField inputUts;
    private JTextField inputUas;
    private JTextField inputTugas;
    private JButton btnProses;
    private JButton simpanBtn;
    private JButton tambahBtn;
    private JTextField nUTS1;
    private JTextField nUAS1;
    private JTextField nTugas1;
    private JTextField nUTS2;
    private JTextField nUAS2;
    private JTextField nTugas2;
    private JButton prosesBtn1;
    private JButton hapusBtn;
    private JButton updateBtn;
    private JTable table;
    public JPanel FormNilaiMhsPanel;


    public FormNilaiMhs() throws SQLException {
        table1 = new DefaultTableModel();
        table.setModel(table1); // set model table
        for (String s : Arrays.asList("No", "NIM", "Nama", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Predikat")) {
            table1.addColumn(s);
        }

        setResizable(false); // disable maximize button

        nUTS1.setEnabled(false);
        nUAS1.setEditable(false);
        nTugas1.setEditable(false);
        nUTS2.setEnabled(false);
        nUAS2.setEditable(false);
        nTugas2.setEditable(false);

        simpanBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        hapusBtn.setEnabled(false);
        prosesBtn1.setEnabled(false);

        tampilkanData();
    }

    public void tampilkanData() throws SQLException {
        ArrayList[] list = getMhsList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        Object[] row = new Object[9];
        for (int i = 0; i < list.length; i++) {
            row[0] = i + 1;
            row[1] = list[i].get(0);
            row[2] = list[i].get(1);
            row[3] = list[i].get(2);
            row[4] = list[i].get(3);
            row[5] = list[i].get(4);
            row[6] = list[i].get(5);
            row[7] = list[i].get(6);
            row[8] = list[i].get(7);
            model.addRow(row);
        }

    }

    public ArrayList[] getMhsList() throws SQLException {
        String queryCount = "SELECT COUNT(*) as c FROM mahasiswa";
        Statement state;
        ResultSet resCount,result;
        state = con.createStatement();
        resCount = state.executeQuery(queryCount);
        int sizeTable = 0;

        while (resCount.next()) sizeTable = resCount.getInt("c");
        ArrayList[] mhsList = new ArrayList[sizeTable];
        String query = "SELECT * FROM mahasiswa";
        result = state.executeQuery(query);
        int i = 0;
        while (result.next()) {
            mhsList[i] = new ArrayList();
            mhsList[i].add(result.getString("nim"));
            mhsList[i].add(result.getString("nama"));
            mhsList[i].add(result.getString("nilai_uts"));
            mhsList[i].add(result.getString("nilai_uas"));
            mhsList[i].add(result.getString("nilai_tugas"));
            mhsList[i].add(result.getString("nilai_akhir"));
            mhsList[i].add(result.getString("nilai_huruf"));
            mhsList[i].add(result.getString("predikat"));
            i++;
        }
        return mhsList;
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("Form Nilai Mahasiswa");
        frame.setContentPane(new FormNilaiMhs().FormNilaiMhsPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
