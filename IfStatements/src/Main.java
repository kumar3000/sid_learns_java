import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if-statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are 18 or older!");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child...");
        }
    }
}
