public class Main {
    public static void main(String[] args) {
        // Composition = "part of" relationship between objects
        //               Complex objects can be constructed from smaller objects

        Car car = new Car("Corvette", 2025, "V8");
        System.out.printf("%d %s has a %s\n", car.year, car.model, car.engine);
        car.start();
    }
}
