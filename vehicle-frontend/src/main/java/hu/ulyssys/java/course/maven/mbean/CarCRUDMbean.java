package hu.ulyssys.java.course.maven.mbean;

import hu.ulyssys.java.course.maven.entity.Car;
import hu.ulyssys.java.course.maven.service.CarService;
import hu.ulyssys.java.course.maven.service.OwnerService;


import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CarCRUDMbean extends OwnerAwareCRUDMBean<Car> implements Serializable {

    @Inject
    public CarCRUDMbean(CarService carService, OwnerService ownerService) {
        super(carService, ownerService);
    }

    @Override
    protected String dialogName() {
        return "carDialog";
    }

    @Override
    protected Car initNewEntity() {
        return new Car();
    }
}