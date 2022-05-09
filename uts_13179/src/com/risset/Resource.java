package com.risset;

import java.util.Date;

public class Resource {
    private String title;
    private Boolean borrowed_status;
    private String date_borrowed;
    private String due_date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String resourceTitle){
        this.title = resourceTitle;
    }

    public Boolean getBorrowed_status() {
        return borrowed_status;
    }

    public void setBorrowedStatus(Boolean borrowed_status) {
        this.borrowed_status = borrowed_status;
    }

    public String getDateBorrowed() {
        return date_borrowed;
    }

    public void setDateBorrowed(String date_borrowed) {
        this.date_borrowed = date_borrowed;
    }


    public void setDueDate(Date due_date) {
        this.due_date = String.valueOf(due_date);
    }

}
