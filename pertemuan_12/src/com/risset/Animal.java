package com.risset;

public class Animal {
    String color = "White";

    String eat() {
        return "I eat everything.";
    }
}

class Dog extends Animal {
    String eat() {
        String e = " Dog eating bones.";
        return super.eat() + e;
    }
    void bark() {
        System.out.println("Guk Guk!");
    }
}