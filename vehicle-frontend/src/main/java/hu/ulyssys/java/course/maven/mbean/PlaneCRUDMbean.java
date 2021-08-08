package hu.ulyssys.java.course.maven.mbean;

import hu.ulyssys.java.course.maven.entity.Plane;
import hu.ulyssys.java.course.maven.service.OwnerService;
import hu.ulyssys.java.course.maven.service.PlaneService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class PlaneCRUDMbean extends OwnerAwareCRUDMBean<Plane> {

    @Inject
    public PlaneCRUDMbean(PlaneService planeService, OwnerService farmerService) {
        super(planeService, farmerService);
    }

    @Override
    protected String dialogName() {
        return "planeDialog";
    }

    @Override
    protected Plane initNewEntity() {
        return new Plane();
    }
}
