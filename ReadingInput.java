package com.company;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //used to specify where to read data from (Terminal in this case)
        System.out.print("Age: ");
        byte age = scanner.nextByte();    // nextByte method for reading a byte
        System.out.println("You are" + age); //implicit conversion
        String name = scanner.nextLine().trim(); //method chaining
        System.out.println(name);



    }
}
