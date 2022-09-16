//Arrays are reference types
//Exceptions are Java's ways to throw errors
//Arrays have a fixed length
package com.company;


import java.util.Arrays;

public class arraysInJava {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,1,4}; //creates an array
        //Arrays.sort(numbers); //sorts an array
        System.out.println(numbers.length);




        System.out.println(Arrays.toString(numbers)); //method overloading
                                                      //print numbers of array
    }
}

