//for-each loop is forward only
//can't iterate backwards
package com.company;

public class forEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits)//String variable named fruit declared : array of fruits
                                   //In each iteration fruit will hold value of one item in array
            System.out.println(fruit);
    }
}
