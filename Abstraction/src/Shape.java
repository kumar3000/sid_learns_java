public abstract class Shape {

    abstract double area(); // ABSTRACT method, needs implementation in child classes

    void display() { // CONCRETE method, is inherited without need for implementation
        System.out.println("This is a shape.");
    }
}
