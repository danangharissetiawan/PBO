package com.risset;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public double ipk;

    public Mahasiswa() {

    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        nim = nimBaru;
        nama = namaBaru;
        alamat = alamatBaru;
        ipk = ipkBaru;
    }

     public void setNim(String nimBaru) {
        nim = nimBaru;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String namaBaru) {
        nama = namaBaru;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamatBaru) {
        alamat = alamatBaru;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    public double getIpk() {
        return ipk;
    }

    public static String predikat(double ipk) {
        switch (ipk >= 2.0 & ipk <= 2.75 ? "C" : ipk >= 2.76 && ipk <= 3.5  ? "B" : ipk >= 3.51 && ipk <= 4.0 ? "A" : "D") {
            case "C":
                return "Memuaskan";
            case "B":
                return "Sangat Memuaskan";
            case "A":
                return "Dengan Pujian";
            default:
                return "-";

        }
    }

    public void cetak() {
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);
        System.out.println("NIM = " + nim);
        System.out.println("IPK = " + ipk);
        System.out.println("Predikat = " + predikat(ipk));
    }
}
