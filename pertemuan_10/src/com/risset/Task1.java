package com.risset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

    Set<String> books = new TreeSet<String>();

    public static void print(Set<String> books) {
        Iterator<String> it = books.iterator();
        for (int i = 0; it.hasNext(); i++) {
            System.out.println(i+1 + ". " + it.next());
        }
    }


    public static void main(String[] args) {
        Task1 perpus = new Task1();
        perpus.books.add("Dilan 1990");
        perpus.books.add("Laskar Pelangi");
        perpus.books.add("Mahaguru");
        perpus.books.add("Mengejar Matahari");
        perpus.books.add("Dilan 1991");
        perpus.books.add("Milea");
        perpus.books.add("Perahu Kertas");
        perpus.books.add("Laskar Pelangi");
        perpus.books.add("Perahu Kertas");

        System.out.println("Daftar Buku : ");
        print(perpus.books);


    }
}
