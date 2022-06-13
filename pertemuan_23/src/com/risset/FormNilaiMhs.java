package com.risset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
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
    private JButton keluar;


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
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int index = table.getSelectedRow();
                try {
                    terpilih(index);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                prosesBtn1.setEnabled(true);
                hapusBtn.setEnabled(true);
            }
        });
        simpanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanActionPerformed();
            }
        });

        btnProses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesHitungNilai();
            }
        });

        tambahBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahActionPerformed();
            }
        });

        prosesBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses1ActionPerformed();
            }
        });
        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateActionPerformed();
            }
        });
        hapusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusActionPerformed();
            }
        });
        btnProses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesActionPerformed();
            }
        });
        keluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keluarActionPerformed();
            }
        });
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

    public void kosongkanText() {
        inputNim.setText("");
        inputNama.setText("");
        inputUts.setText("");
        inputUas.setText("");
        inputTugas.setText("");

        nUTS1.setText("");
        nUAS1.setText("");
        nTugas1.setText("");
        nUTS2.setText("");
        nUAS2.setText("");
        nTugas2.setText("");
    }

    public void prosesHitungNilai() {
        try {
            String nim = inputNim.getText();
            String nama = inputNama.getText();
            double uts = Double.parseDouble(inputUts.getText());
            double uas = Double.parseDouble(inputUas.getText());
            double tugas = Double.parseDouble(inputTugas.getText());

            Mhs mhs = new Mhs(nim, nama, uts, uas, tugas);
            nUTS1.setText(""+mhs.uts());
            nUAS1.setText(""+mhs.uas());
            nTugas1.setText(""+mhs.tugas());

            nUTS2.setText(""+mhs.nilaiAkhir());
            nUAS2.setText(""+mhs.getNilHuruf(mhs.nilaiAkhir()));
            nTugas2.setText(""+mhs.getPredikat(mhs.getNilHuruf(mhs.nilaiAkhir())));
            simpanBtn.setEnabled(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputan Anda Kosong", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void kosongkanTabel() {
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
        model.setRowCount(0);
    }

    public void terpilih(int index) throws SQLException {
        ArrayList[] list = getMhsList();
        inputNim.setText((String) list[index].get(0));
        inputNama.setText((String) list[index].get(1));
        inputUts.setText((String) list[index].get(2).toString());
        inputUas.setText((String) list[index].get(3).toString());
        inputTugas.setText((String) list[index].get(4).toString());

        btnProses.setEnabled(true);
        simpanBtn.setEnabled(true);
    }

    private void prosesActionPerformed() {//GEN-FIRST:event_prosesActionPerformed
        prosesHitungNilai();
    }//GEN-LAST:event_prosesActionPerformed

    private void simpanActionPerformed() {//GEN-FIRST:event_simpanActionPerformed
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO mahasiswa(nim, nama, nilai_uts, nilai_uas, nilai_tugas, nilai_akhir, nilai_huruf, predikat) VALUES(?,?,?,?,?,?,?,?) ");
            ps.setString(1, inputNim.getText());
            ps.setString(2, inputNama.getText());
            ps.setString(3, inputUts.getText());
            ps.setString(4, inputUas.getText());
            ps.setString(5, inputTugas.getText());
            ps.setString(6, nUTS2.getText());
            ps.setString(7, nUAS2.getText());
            ps.setString(8, nTugas2.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            SQLException ex = (SQLException) e;
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            kosongkanText();
            kosongkanTabel();
            tampilkanData();
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }

    }

    private void tambahActionPerformed() {//GEN-FIRST:event_tambahLainActionPerformed
        kosongkanText();
        btnProses.setEnabled(false);

        // tidak bisa diketik
        nUTS1.setEditable(false);
        nUAS1.setEditable(false);
        nTugas1.setEditable(false);
        nUTS2.setEditable(false);
        nUAS2.setEditable(false);
        nTugas2.setEditable(false);

        // tidak bisa diklik
        simpanBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        hapusBtn.setEnabled(false);
        prosesBtn1.setEnabled(false);


    }//GEN-LAST:event_tambahLainActionPerformed

    private void proses1ActionPerformed() {//GEN-FIRST:event_proses1ActionPerformed
        prosesHitungNilai();
        updateBtn.setEnabled(true);
        simpanBtn.setEnabled(false);
    }

    private void keluarActionPerformed() {//GEN-FIRST:event_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void updateActionPerformed() {//GEN-FIRST:event_updateActionPerformed
        String updateQuery = null;
        PreparedStatement ps = null;

        updateQuery = "UPDATE mahasiswa SET nama = ?, nilai_uts = ?, nilai_uas = ?, nilai_tugas = ?, nilai_akhir = ?, nilai_huruf = ?, predikat = ? WHERE nim = ?";

        try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, inputNim.getText());
            ps.setString(2, inputNama.getText());
            ps.setString(3, inputUts.getText());
            ps.setString(4, inputUas.getText());
            ps.setString(5, inputTugas.getText());

            ps.setString(6, nUTS2.getText());
            ps.setString(7, nUAS2.getText());
            ps.setString(8, nTugas2.getText());
            ps.setString(9, inputNim.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            kosongkanText();
            kosongkanTabel();
            tampilkanData();
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void hapusActionPerformed() {//GEN-FIRST:event_hapusActionPerformed
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM mahasiswa WHERE nim = ?");
            String nim = inputNim.getText();
            ps.setString(1, nim);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            kosongkanText();
            kosongkanTabel();
            tampilkanData();
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_hapusActionPerformed

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
