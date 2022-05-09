package com.risset;

public class TesPegawai {

    public static boolean isNamaSama(Manager p1, Manager p2) {
        return p1.getNama().toLowerCase().equals(p2.getNama().toLowerCase());
    }

    public static double max2(double a, double b) {
        return a > b ? a : b;
    }


    public static void main(String[] args) {
        Manager e[] = new Manager[3];
        e[0] = new Manager();
        e[1] = new Manager(2, "Otong Mansyur", "IS", 1300.50, 300.00);
        e[2] = new Manager(3, "Ucup", "Accounting", 1250.50, 100.50);
        e[0].accept(1, "Ucup", "IT", 1250.00, 20.5);

        for (Manager manager : e) {
            manager.display();
            System.out.println();
        }

        System.out.print("\nManager 1 dan Manager 3 memiliki nama yang ");
        if(isNamaSama(e[0], e[2])) {
            System.out.println("sama");
        } else {
            System.out.println("berbeda");
        }

        if(e[0].computeSal() > max2(e[1].computeSal(), e[2].computeSal())) {
            System.out.println("\nMaximum Salary :" + e[0].computeSal());
        } else if (e[1].computeSal() > max2(e[0].computeSal(), e[2].computeSal())) {
            System.out.println("\nMaximum Salary :" + e[1].computeSal());
        } else {
            System.out.println("\nMaximum Salary :" + e[2].computeSal());
        }
    }


}
