package com.risset;

public class Orang {
    private String nama;
    private String alamat;

    public Orang() {}

    public Orang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
