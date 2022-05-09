package com.risset;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MathDate {

    public static void main(String[] args) {
        System.out.println("Absolut -25 = " + Math.abs(-25));
        System.out.println("Sin 0 = " + Math.sin(0));
        System.out.println("Cos 0 = " + Math.cos(0));
        System.out.println("Tan 0 = " + Math.tan(0));
        System.out.println("9 pangkat 2 = " + Math.pow(9, 2));
        System.out.println("Pembulatan ke bawah 3.14 = " + Math.floor(3.14));
        System.out.println("Angka random = " + Math.random());

        // Class library date
        Date tanggal = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("\nOriginal = " + tanggal);
        System.out.println("Format 1 = " + sdf1.format(tanggal));
        System.out.println("Format 2 = " + sdf2.format(tanggal));

        // Class library calendar
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 3);
        Date tigaHariLagi = cal.getTime();
        System.out.println("\nTiga hari lagi = " + sdf2.format(tigaHariLagi));
    }
}
