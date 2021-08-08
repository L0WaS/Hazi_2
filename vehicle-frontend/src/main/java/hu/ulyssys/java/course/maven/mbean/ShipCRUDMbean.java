package hu.ulyssys.java.course.maven.mbean;

import hu.ulyssys.java.course.maven.entity.Ship;
import hu.ulyssys.java.course.maven.service.OwnerService;
import hu.ulyssys.java.course.maven.service.ShipService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class ShipCRUDMbean extends OwnerAwareCRUDMBean<Ship> {

    @Inject
    public ShipCRUDMbean(ShipService shipService, OwnerService farmerService) {
        super(shipService, farmerService);
    }

    @Override
    protected String dialogName() {
        return "shipDialog";
    }

    @Override
    protected Ship initNewEntity() {
        return new Ship();
    }
}
