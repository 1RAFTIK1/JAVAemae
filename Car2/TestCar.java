
package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "ABC123", "Red", 2020, "John Doe", "1234567890");
        System.out.println("Car Type: " + car.vehicleType());
        System.out.println("Car Owner: " + car.getOwnerName());
        System.out.println("Car Insurance Number: " + car.getInsuranceNumber());
        System.out.println("Car Engine Type: " + car.getEngineType());

        Vehicle electricCar = new ElectricCar("Tesla", "DEF456", "Blue", 2022, "Jane Smith", "0987654321", 82);
        System.out.println("Electric Car Type: " + electricCar.vehicleType());
        System.out.println("Electric Car Owner: " + electricCar.getOwnerName());
        System.out.println("Electric Car Insurance Number: " + electricCar.getInsuranceNumber());
        System.out.println("Electric Car Engine Type: " + electricCar.getEngineType());
        System.out.println("Electric Car Battery Capacity: " + ((ElectricCar) electricCar).getBatteryCapacity() + " kWh");
    }
}
