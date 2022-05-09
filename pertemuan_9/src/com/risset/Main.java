package com.risset;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // create triangle using *
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print(" ");
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        // create pyramid using number
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }


    }
}
