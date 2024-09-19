package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("John Doe", "INS12345", "Gasoline");
        System.out.println("Car Owner: " + car.getOwnerName());
        System.out.println("Car Insurance Number: " + car.getInsuranceNumber());
        System.out.println("Car Engine Type: " + car.getEngineType());

        ElectricCar electricCar = new ElectricCar("Jane Smith", "EINS67890", 75);
        System.out.println("Electric Car Owner: " + electricCar.getOwnerName());
        System.out.println("Electric Car Insurance Number: " + electricCar.getInsuranceNumber());
        System.out.println("Electric Car Engine Type: " + electricCar.getEngineType());
        System.out.println("Electric Car Battery Capacity: " + electricCar.getBatteryCapacity() + " kWh");
    }
}
