import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        // Declare variables
        Scanner sc = new Scanner(System.in);
        double weight;
        int option;

        // Welcome message
        System.out.println("Welcome to the weight converter...");

        // Prompt for user choice
        System.out.print("Please input your weight: ");
        weight = sc.nextDouble();
        System.out.print("Convert to kgs (1) or lbs (2)?: ");
        option = sc.nextInt();

        // Option 1 convert lbs to kgs
        // Option 2 convert kgs to lbs
        // else print "not a valid choice"
        if (option == 1) {
            weight *= 0.45359237;
            System.out.printf("Weight in kgs: %.2f", weight);
        } else if (option == 2) {
            weight *= 2.205;
            System.out.printf("Weight in lbs: %.2f", weight);
        } else {
            System.out.println("Not a valid choice!");
        }

        sc.close();
    }
}
