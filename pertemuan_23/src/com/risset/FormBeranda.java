package com.risset;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class FormBeranda extends JFrame {
    private JPanel FormBerandaPanel;
    private JMenuBar menuBar;
    private JMenu menuBeranda;
    private JMenu menuLaporan;
    private JMenuItem menuDataMhs;
    private JMenuItem menuDataDosen;
    private JMenuItem menuKeluar;

    public FormBeranda() {


        menuDataMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               JFrame frame = new JFrame("Siakad");
               try {
                   frame.setContentPane(new FormNilaiMhs().FormNilaiMhsPanel);
               } catch (SQLException ex) {
                   ex.printStackTrace();
               }

               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               frame.pack();
               frame.setVisible(true);
               dispose();
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new FormBeranda().FormBerandaPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
