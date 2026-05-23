public class Main {
    public static void main(String[] args) {
        Car car = new Car("Silvia", "White", 5000);
        System.out.printf("%s %s is %s\n", car.getColor(), car.getModel(), car.getPrice());
        car.setColor("Purple");
        System.out.printf("%s %s is %s\n", car.getColor(), car.getModel(), car.getPrice());
    }
}
