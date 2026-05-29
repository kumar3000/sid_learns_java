import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types!
        //            <T, U> type parameter (placeholder that gets replaced with type)
        //            <String> type argument (specifies the type)

        Box<String> stringBox = new Box<>();
        stringBox.setItem("banana");
        System.out.println(stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(1);
        System.out.println(intBox.getItem());

        // more than one type
        Product<String, Double> banana = new Product<>("banana", 1.99);
        Product<String, Integer> apple = new Product<>("apple", 2);
        System.out.println(banana.getItem() + " $" + banana.getPrice());
        System.out.println(apple.getItem() + " $" + apple.getPrice());
    }
}
