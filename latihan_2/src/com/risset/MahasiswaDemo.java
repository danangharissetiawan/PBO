package com.risset;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("==== Mahasiswa 1 =====");
        mhs.setNama("Danang Haris Setiawan");
        mhs.setNim("A11202013179");
        mhs.setAlamat("Tuban, JATIM");
        mhs.setIpk(3.85);
        mhs.cetak();

        System.out.println("\n==== Mahasiswa 2 =====");
        Mahasiswa mhs2 = new Mahasiswa("A11202013180");
        mhs2.setNama("Rizki Ramadhan");
        mhs2.setAlamat("Tuban, JATIM");
        mhs2.setIpk(2.74);
        mhs2.cetak();

        System.out.println("\n==== Mahasiswa 3 =====");
        Mahasiswa mhs3 = new Mahasiswa("A11202013181","Rizki", "Tuban, JATIM", 3.49);
        mhs3.cetak();
    }
}
