package com.company;

public class TheMathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);      //rounds a floating point number to a whole number
        System.out.println(result);
        int result1 = (int)Math.ceil(1.1F); //ceil returns the closest integer rounded off
        System.out.println(result1);
        int result2 = (int)Math.floor(1.1F); //floor of a number is the largest int that is smaller or equal to this number
        System.out.println(result2);
        int result3 = Math.max(1,2);// returns the greater number
        System.out.println(result3);
        double result4 = Math.random() * 100; //generates a random number in decimal
        System.out.println(result4);
        double result5 = Math.round(Math.random() * 100); // returns rounded off random number
        System.out.println(result5);
        int result6 = (int) (Math.random() *100);
        System.out.println(result6);
    }
}
