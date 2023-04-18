package com.jpa2.jpa2.inheritanceMapping;
public class Car extends Vehicle {
    private int numWheels;

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}