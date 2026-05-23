public class Car {

    final String model;
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // getters
    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    // setters

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        this.price = price;
    }
}
