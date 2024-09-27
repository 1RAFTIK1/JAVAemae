package vehicle;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "Gas");
    }

    public String vehicleType() {
        return "Car";
    }
}
