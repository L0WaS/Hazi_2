package hu.ulyssys.java.course.maven.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractVehicle extends AbstractEntity implements VehicleTypeAware {
    // long - 0 primitive
    // Long - null referencia/objektum típusú
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "type")
    private String type;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public AbstractVehicle() {
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public VehicleType getVehicleType() {
        return null;
    }
}
