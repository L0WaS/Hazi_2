package hu.ulyssys.java.course.maven.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Table
public class Plane extends AbstractVehicle {
    @Max(value = 80)
    @Column(name = "passenger_number")
    private int passengerNumber;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.PLANE;
    }
}
