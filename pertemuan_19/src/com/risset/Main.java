package com.risset;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    // checked exception
        File file = new File("src/com/risset/input.txt");
//        FileReader fileReader = new FileReader(file);

        // unchecked exception
        int num [] = {1,2,3,4,5};
//        System.out.println(num[6]);

        // try-catch-finally
        try {
            FileReader fileReader = new FileReader(file);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // try-with-resources
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println(fileReader.read());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Error");
        }

        // try-catch-finally
        try {
            int a[] = {1,2,3,4,5};
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Checked");
        }

        // multiple catch
        try {
            int num1 = 10/0;
            System.out.println(num1);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Checked");
        }

    }
}
