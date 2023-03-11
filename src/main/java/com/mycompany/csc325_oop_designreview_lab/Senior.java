/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * This class stores methods & variables related to a senior object
 * @author James Kostrewski
 */
public class Senior extends Student {
    private int credits;
    
    // constructor method. as per todo 8, will throw exception if <85 credits
    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) throw new IllegalArgumentException(
        "expected credits to be greater than or equal to 85, but was " + credits);
        
        this.credits = credits;
    }

    // toString method
    @Override
    public String toString() {
        return "\nSenior{Name=" + this.getName()
                + " Address=" + this.getAddress()
                + " GPA=" + this.getGPA() 
                + " Credits=" + this.getCredits() + '}';
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(short credits) {
        this.credits = credits;
    }
    
    
    
}
