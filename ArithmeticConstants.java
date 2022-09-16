package com.company;

public class ArithmeticConstants {
    public static void main(String[] args) {
        double result = (double)10/(double)3; //casting done to avoid error
        int x = 1;
        //x = x + 2;
        //x += 2; 'compound assignment operators'
        //x -+ 2;
        int y = x++;
      //int y = ++x;
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
    }
}


//++x prefix
//x++ postfix