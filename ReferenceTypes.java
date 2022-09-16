//Primitive type is used to store simple values
//Reference type is used to store complex values
package com.company;

import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        Date now = new Date();//operator to allocate memory for this variable
                              //Reference type always require memory allocation
                              //now is the instance of Date() class called object
                              //can be accessed using dot operator
        System.out.println(now);
    }
}
