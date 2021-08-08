package hu.ulyssys.java.course.maven.entity;

import javax.persistence.*;

@Entity
@Table
public class Car extends AbstractVehicle {

    @Column(name = "license_plate_number")
    private String licensePlateNumber;
    @Column(name = "door_numbers")
    private int doorNumbers;

    //erre csak akkor van szükség, ha van olyan konsttuktor, aminek van bemenő paramétere. Ez az üres konstruktor

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public int getDoorNumbers() {
        return doorNumbers;
    }

    public void setDoorNumbers(int doorNumbers) {
        this.doorNumbers = doorNumbers;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }


}
