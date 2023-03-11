/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author James Kostrewski
 */
public class MainClass {

    public static void main(String[] args) {
        // creat 2 student objects from child classes
        Student fm1 = new Freshman("James", (short) 20, 12); // name, age, credits
        Student sn1 = new Senior("John", (short) 30, 90);

        // Set the gpa of the student (freshman) using the scanner and user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter GPA for James:");
        double myGPA = keyboard.nextDouble();
        fm1.setGPA(myGPA);
        
        // Set the gpa of the student (senior) using the scanner and user
        System.out.println("Enter GPA for John:");
        myGPA = keyboard.nextDouble();
        sn1.setGPA(myGPA);
        
        // prints string representation of James
        System.out.println(fm1);
        // prints string representation of John
        System.out.println(sn1);

    }

}
