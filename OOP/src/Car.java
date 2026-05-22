public class Car {
    String make;
    String model;
    int year ;
    double price;
    boolean isRunning = false;

    Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void start() {
        isRunning = true;
        System.out.println("You started the engine!");
    }

    void stop() {
        isRunning = false;
        System.out.println("You turned off the car.");
    }

    void drive() {
        System.out.println("You drove the " + model + "!");
    }

    void brake() {
        System.out.println("You brake the " + model + "!");
    }
}
