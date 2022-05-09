package com.risset;

public class Lingkaran {
    double jari_jari;
    double phi = 3.14;
    static int jumlahLingkaran = 0; //static variabel

    public Lingkaran() {
        jumlahLingkaran++;
    }

    public Lingkaran(double jari_jari_baru) {
        jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }

    public static void getJumlahLingkaran(){
        System.out.println("Jumlah lingkaran : " + jumlahLingkaran);
    }

    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    public double getKeliling() {
        return 2 * phi * jari_jari;
    }
}