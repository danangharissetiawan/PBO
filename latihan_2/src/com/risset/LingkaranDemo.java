package com.risset;

public class LingkaranDemo {
    public static void main(String[] args) {
        Lingkaran.getJumlahLingkaran();
        Lingkaran l1 = new Lingkaran();
        System.out.println("Jari-jari lingkaran 1 : " + l1.jari_jari);
        System.out.println("Luas lingkaran 1: " + l1.getLuas());
        System.out.println("Keliling lingkaran 1: " + l1.getKeliling() + "\n");
        Lingkaran.getJumlahLingkaran();
        Lingkaran l2 = new Lingkaran();
        l2.jari_jari = 5;
        System.out.println("Jari-jari lingkaran 2 : " + l2.jari_jari);
        System.out.println("Luas lingkaran 2: " + l2.getLuas());
        System.out.println("Keliling lingkaran 2: " + l2.getKeliling() + "\n");
        Lingkaran.getJumlahLingkaran();
        Lingkaran l3 = new Lingkaran(10);
        System.out.println("Jari-jari lingkaran 3 : " + l3.jari_jari);
        System.out.println("Luas lingkaran 3: " + l3.getLuas());
        System.out.println("Keliling lingkaran 3: " + l3.getKeliling() + "\n");
        Lingkaran.getJumlahLingkaran();
    }
}
