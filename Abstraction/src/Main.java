public class Main {
    public static void main(String[] args) {
        // abstract = Used to define abstract classes and methods.
        //            Process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 5);
        Rectangle rectangle = new Rectangle(5, 5);
        double area;

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
