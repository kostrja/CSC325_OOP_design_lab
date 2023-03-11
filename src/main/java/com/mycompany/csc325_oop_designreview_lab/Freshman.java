/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * This class stores data and methods related to the function of a freshman object
 * @author James Kostrewski
 */
public class Freshman extends Student {
    private int credits;
    
    // constructor
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
   
    // toString method
    @Override
    public String toString() {
        return "\nFreshman{Name=" + this.getName()
                + " Address=" + this.getAddress()
                + " GPA=" + this.getGPA() 
                + " Credits=" + this.getCredits() + '}';
    }
    
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
}
