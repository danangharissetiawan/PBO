package com.risset;

public class Sarjana extends Murid {
    private double ipk;

    public Sarjana() {}

    public Sarjana(String nama, String alamat, int nim, double ipk) {
        super(nama, alamat, nim);
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void reset(String nama, String alamat, int nim, double ipk) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(nim);
        setIpk(ipk);
    }

    public String predikat(double ipk) {
        if (ipk >= 3.51) {
            return "Dengan Pujian";
        } else if (ipk >= 2.76) {
            return "Sangat Memuaskan";
        } else if (ipk >= 2.0) {
            return "Memuaskan";
        } else {
            return "-";
        }
    }

    public void cetak() {
        super.cetak();
        System.out.println("IPK: " + getIpk());
        System.out.println("Predikat: " + predikat(getIpk()));
    }
}
