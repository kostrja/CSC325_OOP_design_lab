/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * This class stores methods and variables related to the functioning of a student object
 * @author James Kostrewski
 */
public class Student extends Human {

    private double GPA;

    // constructor with call to super
    public Student(String name, short age) {
        super(name, age);
    }

    // constructor with GPA included
    public Student(String name, short age, double gpa) {
        super(name, age);
        GPA = gpa;
    }
    
    // toString method
    @Override
    public String toString() {
        return "\nStudent{Name=" + this.getName()
                + " Address=" + this.getAddress()
                + " GPA=" + GPA + '}';
    }
    
    

    // BOILERPLATE GETTER & SETTER SECTION
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
// ToDo 1: Make this class a child of Person DOES NOT EXIST
// ToDo 1: Make this class a child of Human DONE
// ToDo 2: Fix the resulting errors DONE
// ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
