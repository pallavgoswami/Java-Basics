package com.company;

public class conditions {
    public static void main(String[] args) {
        int temp = 30;
        if (temp > 30) { //curly braces added to define a code block for multiple statements
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");


    }
}
