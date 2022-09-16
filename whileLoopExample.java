//we cannot use operators between reference types
//they compare address not string value
package com.company;

import java.util.Scanner;

public class whileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase(); //stores user input in any case
            System.out.println(input);
        }
    }
}
