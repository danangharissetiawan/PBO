package com.risset;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println("ukuran awal al: " + al.size());
        al.add(3.14);
        al.add("D");
        al.add(4);
        al.add(1, "A2");
        System.out.println("Ukuran al setelah penambahan: " + al.size());
        System.out.println("Isi dari al: " + al);
        al.remove("D");
        al.remove(2);
        System.out.println("Ukuran al setelah penghapusan: " + al.size());
        System.out.println("Isi dari al: " + al);
    }
}
