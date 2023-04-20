package com.jpa2.jpa2.inheritanceMapping;
import jakarta.persistence.*;

/*
   Inheritance Mapping:
   Implement and demonstrate Single Table strategy.
   Implement and demonstrate Joined strategy.
   Implement and demonstrate Table Per Class strategy.
   */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
    @Id
    private String vehicleNo;
    private int speed;

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}