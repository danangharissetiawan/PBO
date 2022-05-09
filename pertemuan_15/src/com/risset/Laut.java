package com.risset;

public class Laut extends Kendaraan {
    private boolean mesin;

    public Laut() {}

    public Laut(String nama, int tahunProduksi, boolean mesin) {
        super(nama, tahunProduksi);
        this.mesin = mesin;
    }

    public boolean getMesin() {
        return mesin;
    }

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }

    public void cetak() {
        System.out.println("Nama: " + getNama());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Mesin: " + getMesin());
    }
}
