package com.company;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        //NumberFormat currency = new NumberFormat() // Number Format is abstract, it cannot be instantiated
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);
        //method chaining
        String result2 = NumberFormat.getPercentInstance().format(0.1);//short method
        System.out.println(result2);





    }
}
