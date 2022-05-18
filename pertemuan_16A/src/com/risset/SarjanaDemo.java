package com.risset;

public class SarjanaDemo {

    public static Boolean isAlamatSama(Sarjana s1, Sarjana s2) {
        return s1.getAlamat().toLowerCase().equals(s2.getAlamat().toLowerCase());
    }

    public static double min2(double a, double b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        Sarjana s[] = new Sarjana[3];
        s[0] = new Sarjana("Dilan", "Bandung", 1, 3.51);
        s[1] = new Sarjana("Milea", "Jakarta", 2, 3.0);
        s[2] = new Sarjana();
        s[2].reset("Cinta", "Bandung", 3, 1.75);

        for (Sarjana sarjana : s) {
            sarjana.cetak();
            System.out.println("");
        }

        System.out.print("Alamat Dilan dan Cinta sama? ");
        if(isAlamatSama(s[0], s[2])) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        if(s[0].getIpk() < min2(s[1].getIpk(), s[2].getIpk())) {
            System.out.println("IPK terkecil adalah " + s[0].getIpk() + " milik " + s[0].getNama());
        } else if(s[1].getIpk() < min2(s[0].getIpk(), s[2].getIpk())) {
            System.out.println("IPK terkecil adalah " + s[1].getIpk() + " milik " + s[1].getNama());
        } else {
            System.out.println("IPK terkecil adalah " + s[2].getIpk() + " milik " + s[2].getNama());
        }

    }
}
