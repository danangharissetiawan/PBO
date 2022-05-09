package com.risset;

public class Pegawai {

    private int id;
    private String nama;
    private String departemen;
    private double gaji;

    public Pegawai() {}


    public Pegawai(int id, String nama, String departemen, double gaji) {
        this.id = id;
        this.nama = nama;
        this.departemen = departemen;
        this.gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void display() {
        System.out.println("ID\t: " + id);
        System.out.println("Nama\t: " + nama);
        System.out.println("Departemen\t: " + departemen);
        System.out.println("Gaji\t: " + gaji);
    }
}
