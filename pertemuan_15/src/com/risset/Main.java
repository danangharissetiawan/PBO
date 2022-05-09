package com.risset;

public class Main {

    public static void printNama(Kendaraan ken) {
        System.out.println("====== " + ken.getNama() + " ======");
    }

    public static void printToString(Kendaraan ken) {
        ken.cetak();
    }

    public static void main(String[] args) {
        Kapal kendaraan1 = new Kapal("Kapal Titanic", 1909, true, 2224);
        Pesawat kendaraan2 = new Pesawat("Garuda Boeing 777", 1990, true, 305);

        printNama(kendaraan1);
        printToString(kendaraan1);
        System.out.println();
        printNama(kendaraan2);
        printToString(kendaraan2);

    }
}
