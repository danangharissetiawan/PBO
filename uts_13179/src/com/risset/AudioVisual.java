package com.risset;
import java.util.Date;

class AudioVisual extends Resource{
    private String Production_Company;
    private String type;
    private int year_of_release;

    public String getProductionCompany() {
        return Production_Company;
    }

    public void setProductionCompany(String CompanyName) {
        this.Production_Company = CompanyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfRelease() {
        return year_of_release;
    }

    public void setYearOfRelease(int year) {
        this.year_of_release = year;
    }

    public String dueDate(Date borrowedData) {
        return borrowedData.toString();
    }
}