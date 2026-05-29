import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //             (divide by zero, file not found, etc)
        // try{}, catch{}. finally{}

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        }

        catch (InputMismatchException e) {
            System.out.println("Must be a number!");
        }

        catch (Exception e) { // safety net at the end, but not best practice
            System.out.println("Something went wrong...");
        }

        finally { // always executes regardless of exceptions
            sc.close();
            System.out.println("This always executes!");
        }
    }
}
