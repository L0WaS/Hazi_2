package hu.ulyssys.java.course.maven.service.impl;

import hu.ulyssys.java.course.maven.entity.AbstractVehicle;

public class VehiclePrinterServiceImpl {

    public void printVehicleBase(AbstractVehicle vehicle) {
        System.out.print("Id: " + vehicle.getId());
        System.out.print(", Gyártó: " + vehicle.getManufacturer());
        System.out.print(", Típus: " + vehicle.getType());
        System.out.print(", Jármű típusa: " + vehicle.getVehicleType());

    }
}
