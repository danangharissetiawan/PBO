package com.risset;

public class MobilDemo {

    public static int min2(int a, int b) {
        return a < b ? a : b;
    }

    public static Boolean isNamaSama(Mobil m1, Mobil m2) {
        return m1.getNama().toLowerCase().equals(m2.getNama().toLowerCase());
    }

    public static void main(String[] args) {
        Mobil[] m = new Mobil[3];
        m[0] = new Mobil();
        m[1] = new Mobil("Limousine American Dreams", 1980, 26, 14);
        m[2] = new Mobil("Limousine Superbus", 2011, 6, 33);
        m[0].reset("Limousine Mercedes-Benz 500SEL", 1994, 4, 6);

        m[0].cetak();
        System.out.println("");
        m[1].cetak();
        System.out.println("");
        m[2].cetak();
        System.out.println("");

        System.out.println("Nama Limousine pertama dan kedua ");
        if(isNamaSama(m[0], m[1])) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        System.out.println("");

        if(m[0].getMuatan() < min2(m[1].getMuatan(), m[2].getMuatan())) {
            System.out.println("Muatan paling sedikit = " + m[0].getNama());
        } else if (m[1].getMuatan() < min2(m[0].getMuatan(), m[2].getMuatan())) {
            System.out.println("Muatan paling sedikit = " + m[1].getNama());
        } else {
            System.out.println("Muatan paling sedikit = " + m[2].getNama());
        }

    }
}
