package com.risset;

public class TestMhs {
    public static String nim;
    public static String nama;
    public static String alamat;
    public static double ipk;

    // konstruktor
    TestMhs(){
    }

    TestMhs(String nim){

        TestMhs.nim = nim;
    }

    TestMhs(String NewNim, String NewName, String Newalamat, double Newipk){
        nim = NewNim;
        nama = NewName;
        alamat = Newalamat;
        ipk = Newipk;
    }

    String predikat(double NewIPK){
        ipk = NewIPK;
        if(ipk >= 3.51 && ipk <= 4.0){
            return "Dengan Pujian";
        }
        else if(ipk >= 2.76 && ipk <= 3.51){
            return "Sangat Memuaskan";
        }
        else if(ipk >= 2.0 && ipk <= 2.75){
            return "Memuaskan";
        }
        else{
            return "-";
        }
    }

    void cetak(){
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("NIM : "+nim);
        System.out.println("IPK : "+ipk);
        System.out.println("Predikat : "+predikat(ipk));
    }


    public static void main(String[] args){
        TestMhs mhs1 = new TestMhs();
        nama = "Lailatul Fitriyah";
        nim = "A11.2020.12884";
        alamat = "Semarang";
        ipk = 3.0;
        mhs1.predikat(ipk);
        mhs1.cetak();
    }

}
