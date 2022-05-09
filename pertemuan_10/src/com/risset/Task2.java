package com.risset;

import java.util.Scanner;

public class Task2 extends Task1 {

    public String input() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan judul buku: ");
        String book = input.nextLine();
        return book;
    }

    public void checkbook(String book) {
        if (books.contains(book)) {
            System.out.println("\nBuku " + book + " ada di dalam daftar buku");
        } else {
            System.out.println("\nBuku " + book + " tidak ada di dalam daftar buku");
        }
    }

    public static void main(String[] args) {
        Task2 perpus = new Task2();
        perpus.books.add("Dilan 1990");
        perpus.books.add("Laskar Pelangi");
        perpus.books.add("Mahaguru");
        perpus.books.add("Mengejar Matahari");
        perpus.books.add("Dilan 1991");
        perpus.books.add("Milea");
        perpus.books.add("Perahu Kertas");
        perpus.books.add("Laskar Pelangi");
        perpus.books.add("Perahu Kertas");

        System.out.println("\nDaftar Buku secara Urut: ");
        print(perpus.books);

        String pinjam = perpus.input();
        perpus.checkbook(pinjam);
        perpus.books.remove(pinjam);

        System.out.println("\nDaftar Buku setelah " + pinjam + " dipinjam: ");
        print(perpus.books);



    }
}
