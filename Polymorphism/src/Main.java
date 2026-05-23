import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.
        Scanner scanner = new Scanner(System.in);
        String vehicleType;

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object

        Vehicle vehicle;

        System.out.print("Bike, Car, or Boat: ");
        vehicleType = scanner.nextLine();
        switch (vehicleType) {
            case "Bike" -> {
                vehicle = new Bike();
                vehicle.go();
            }
            case "Car" -> {
                vehicle = new Car();
                vehicle.go();
            }
            case "Boat" -> {
                vehicle = new Boat();
                vehicle.go();
            }
            default -> System.out.println("Invalid vehicle!");
        }

        scanner.close();
    }
}
