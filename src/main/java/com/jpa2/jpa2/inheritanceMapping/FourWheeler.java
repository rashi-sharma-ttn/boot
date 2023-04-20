package com.jpa2.jpa2.inheritanceMapping;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "vehicleNo")
public class FourWheeler extends Vehicle {
    private int seats;
    private int wheels;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}