package com.risset;

public class Main {

    public static void main(String[] args) {
        Encyclopedia book1 = new Encyclopedia();
        book1.setTitle("The Hitchhiker's Guide to the Galaxy");
        book1.setAuthor("Douglas Adams");
        book1.setIsbn(21311);
        book1.setVolume(1);

        System.out.println("Title\t: " + book1.getTitle());
        System.out.println("Author\t: " + book1.getAuthor());
        System.out.println("ISBN\t: " + book1.getIsbn());
        System.out.println("Volume\t: " + book1.getVolume());
    }
}
