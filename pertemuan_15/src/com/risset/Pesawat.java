package com.risset;

public class Pesawat extends Udara{
    private int muatan;

    public Pesawat(){}

    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }

    public int getMuatan(){
        return muatan;
    }

    public void setMuatan(int muatan){
        this.muatan = muatan;
    }

    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }

    public void cetak(){
        System.out.println("Nama Pesawat: " + getNama());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Mesin: " + getMesin());
        System.out.println("Muatan: " + getMuatan());
    }
}
