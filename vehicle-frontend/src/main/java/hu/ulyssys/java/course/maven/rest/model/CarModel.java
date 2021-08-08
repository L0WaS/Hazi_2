package hu.ulyssys.java.course.maven.rest.model;

//CarDTO - Data Transfer Object
public class CarModel extends CoreRestModel{

    private String licensePlateNumber;

    private int doorNumbers;

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
}
