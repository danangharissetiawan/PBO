package com.risset;

public class Manager extends Pegawai {
    private double bonus;

    public Manager() {}

    public Manager(int id, String nama, String departemen, double gaji, double bonus) {
        super(id, nama, departemen, gaji);
        this.bonus = bonus;


    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double computeSal(){
        return getGaji() + bonus;
    }

    public void accept(int id, String nama, String departemen, double gaji, double bonus){
        setId(id);
        setNama(nama);
        setDepartemen(departemen);
        setGaji(gaji);
        setBonus(bonus);
    }

    public void display(){
        super.display();
        System.out.println("Bonus\t: " + getBonus());
    }


}
