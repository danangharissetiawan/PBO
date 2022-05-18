package com.risset;

public class Murid extends Orang {
    private int noInduk;

    public Murid() {}

    public Murid(String nama, String alamat, int noInduk) {
        super(nama, alamat);
        this.noInduk = noInduk;
    }

    public int getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public void cetak() {
        super.cetak();
        System.out.println("No Induk: " + noInduk);
    }
}
