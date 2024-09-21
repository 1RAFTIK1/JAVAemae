package app;

import vehicle.Car;
import vehicle.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Moby Dick", "88005553535", "Gas");
        System.out.println("Car Owner: " + car.getOwnerName());
        System.out.println("Car Insurance Number: " + car.getInsuranceNumber());
        System.out.println("Car Engine Type: " + car.getEngineType());

        ElectricCar electricCar = new ElectricCar("Jigurda mihalich", "6942011", 75);
        System.out.println("Electric Car Owner: " + electricCar.getOwnerName());
        System.out.println("Electric Car Insurance Number: " + electricCar.getInsuranceNumber());
        System.out.println("Electric Car Engine Type: " + electricCar.getEngineType());
        System.out.println("Electric Car Battery Capacity: " + electricCar.getBatteryCapacity() + " kWh");
    }
}
