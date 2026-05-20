import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = -1;
        int number = 0;

        while (name.isEmpty()) {
            System.out.print("What's your name? ");
            name = sc.nextLine();
            if (name.isEmpty()) {
                System.out.println("Your name can't be empty!");
            }
        }

        while (age < 0) {
            System.out.print("What's your age? ");
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Your age can't be negative,");
            }
        }

        do {
            System.out.println("Guess a number 1-10: ");
            number = sc.nextInt();
        } while (number < 1 || number > 10);

        System.out.printf("Hello, %s! You are %d years old.", name, age);
    }
}
