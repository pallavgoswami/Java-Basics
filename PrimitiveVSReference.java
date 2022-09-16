//Reference store reference to an object somewhere in memory
package com.company;

import java.awt.*; //abstract window toolkit
                   //API to develop Graphical User Interface (GUI)

public class PrimitiveVSReference {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);  //pass initial values of x and y
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }
}
//Reference types are copied by their references
//Primitive types are copied by their value and these values are completely independent of each other