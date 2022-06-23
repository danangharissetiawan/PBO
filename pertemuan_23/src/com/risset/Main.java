package com.risset;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

public class Main {

    @Test
    public static void testReport_JDBC() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/siakad_db?"+unicode, "haris", "180900");

        String jrxmlPath = "src/report/ReportNilaiMhs.jrxml";
        String jasperPath = "src/report/ReportNilaiMhs.jasper";

        //Compile Template
        JasperCompileManager.compileReportToFile(jrxmlPath,jasperPath);

        //Construct data
//        Map paramters = new HashMap();
//        paramters.put("company","Wise Podcast");

        //Fill Data - Fill with JDBC Data Source
        Map<String, Object> paramters;
        JasperPrint jasperPrint =
                JasperFillManager.fillReport(jasperPath,
                        null,
                        connection);
        //output file
        String pdfPath = "D:\\test.pdf";
        JasperExportManager.exportReportToPdfFile(jasperPrint,pdfPath);
    }

    public static void main(String[] args) {
        try {
            testReport_JDBC();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
