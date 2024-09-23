public class TestCar {
    public static void main(String[] args) {
        // Create a Car object
        Vehicle car = new Car("Toyota Camry", "X123YZ", "Blue", 2020, "John Doe", "INS12345");
        System.out.println(car);

        // Create an ElectricCar object
        Vehicle electricCar = new ElectricCar("Tesla Model S", "E001XYZ", "Red", 2021, "Jane Smith", "INS67890", 100);
        System.out.println(electricCar);

        // Use polymorphism to work with objects through a base class reference
        Vehicle[] vehicles = {car, electricCar};
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.vehicleType());
            System.out.println(vehicle);
        }
    }
}
