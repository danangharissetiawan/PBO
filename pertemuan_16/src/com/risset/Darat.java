package com.risset;

public class Darat extends Kendaraan {
    private int roda;

    public Darat() {}

    public Darat(String nama, int tahunProduksi, int roda) {
        super(nama, tahunProduksi);
        this.roda = roda;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public void cetak() {
        System.out.println("Nama Kendaraan: " + getNama());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Roda: " + getRoda());
    }
}
