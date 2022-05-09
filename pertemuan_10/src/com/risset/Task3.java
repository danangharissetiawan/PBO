package com.risset;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.TreeMap;
import java.util.Map;

public class Task3 {

    Map<String, String> technologies = new TreeMap<>();

    public static void print(Map<String, String> technologies) {
        int i = 1;
        for (String k: technologies.keySet()) {
            System.out.println(i + ". " + k.toUpperCase() + " dikembangkan oleh " + technologies.get(k));
            i++;
        }
    }

    public static void main(String[] args) {
        Task3 company = new Task3();
        company.technologies.put("Microsoft", "Bill Gates");
        company.technologies.put("Apple", "Steven Paul Jobs");
        company.technologies.put("Linux", "Linux Benedict Torvalds");
        company.technologies.put("Facebook", "Mark Zuckerberg");
        company.technologies.put("Twitter", "Jack Dorsey");
        company.technologies.put("Instagram", "Kevin Systrom");

        print(company.technologies);
    }
}
