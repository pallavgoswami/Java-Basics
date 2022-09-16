// short variable has 2 bytes
// int variable has 4 bytes
// casting can only be done with compatible types
package com.company;

public class Casting {
    public static void main(String[] args) {
        // implicit casting or automatic conversion (no data loss)
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        double a = 1.1;
        double b = a + 2; // 2 will be converted to a double and will be added to 1.1
        double c = 1.1;
        int d = (int)x + 2; //explicit casting
        String e = "1";
        int f = Integer.parseInt(e) + 2;
        //Integer.parseInt() // this method takes a string and returns an integer
        //Short.parseShort()
        //Float.parseFloat()
        System.out.println(f);
    }
}
