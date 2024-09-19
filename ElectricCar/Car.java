package vehicle;

public class Car {

private String ownerName;
private String insuranceNumber;
protected String engineType;

    public Car(String ownerName, String insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }
    public Car(){}

    public String getOwnerName(){
        return ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
