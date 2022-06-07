package com.risset;

public class Mhs implements Nilai{

    public String nim;
    public String nama;
    double vUts; double vUas; double vTugas;
    double pUts; double pUas; double pTugas;
    double nilaiAkhir; char nHuruf;
    String predikat;

    public Mhs(String nim, String nama, double vUts , double vUas, double vTugas) {
        this.nim = nim;
        this.nama = nama;
        this.vUts = vUts;
        this.vUas = vUas;
        this.vTugas = vTugas;
    }

    public double uts() {
        return vUts * 35/100;
    }

    public double uas() {
        return vUas * 35/100;
    }

    public double tugas() {
        return vTugas * 30/100;
    }

    public double nilaiAkhir() {
        return uts() + uas() + tugas();
    }

    @Override
    public char getNilHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 85) {
            nHuruf = 'A';
        } else if (nilaiAkhir >= 70) {
            nHuruf = 'B';
        } else if (nilaiAkhir >= 60) {
            nHuruf = 'C';
        } else if (nilaiAkhir >= 40) {
            nHuruf = 'D';
        } else {
            nHuruf = 'E';
        }
        return nHuruf;
    }

    @Override
    public String getPredikat(char nhuruf) {
        switch (nhuruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }
}
