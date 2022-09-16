//String is a class
//In java strings are immutable i.e. they cannot be mutated/changed
package com.company;

public class Strings {
    public static void main(String[] args) {
        //new operator is used to create new objects and instantiate variables
        String message = "Hello World" + "!!";//no new operator required in short form
        System.out.println(message.endsWith("!!"));//returns a boolean value
        System.out.println(message.length());//displays length of string
        System.out.println(message.indexOf("H"));//displays index of character
        System.out.println(message.replace("!","*" ));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim()); //gets rid of wide spaces


    }
}
