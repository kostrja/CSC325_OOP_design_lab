/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * This is an abstract method used to demonstrate inheritence
 * @author James Kostrewski
 */
public abstract class Human {
    private String name;
    private String address;
    private short age;

    // constructor that takes only two paras
    public Human(String name, short age) {
        this.name = name;
        this.age = age;
    }
    
    // boring getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
