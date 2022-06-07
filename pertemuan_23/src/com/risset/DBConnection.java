package com.risset;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
//    public Connection getConnection() {
//        Connection con = null;
//        try (Connection connection = con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siakad_db", "haris", "180900")) {
//            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
//        } catch (SQLException e) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
//            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
//        }
//
//        return con;
//    }

    public Connection getConnection(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/siakad_db?"+unicode, "haris", "180900");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("couldn't connect!");
            throw new RuntimeException(ex);
        }
    }
}

