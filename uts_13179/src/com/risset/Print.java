package com.risset;
import java.util.Date;

class Print extends Resource{
    private String author;
    private String publisher;
    private String category;
    private int isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

     public String dueDate(Date borrowedData) {
         return borrowedData.toString();
     }
}