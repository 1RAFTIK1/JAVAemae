public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Vehicle(String model, String license, String color, int year, String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public abstract String vehicleType();

    // Getters and setters for all fields
    // ...

    @Override
    public String toString() {
        return "Model: " + model +
                "\nLicense: " + license +
                "\nColor: " + color +
                "\nYear: " + year +
                "\nOwner Name: " + ownerName +
                "\nInsurance Number: " + insuranceNumber +
                "\nEngine Type: " + engineType;
    }
}
