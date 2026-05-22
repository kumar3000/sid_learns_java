import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // array = a collection
        /*
        String[] fruits = {"apple", "durian", "banana", "coconut"};

        for (int i = 0; i < fruits.length; i++) { // classic for loop iteration
            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        for (String fruit : fruits) { // for each loop / enhanced for loop
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.sort(fruits); // sorts alphabetically
        for (String fruit : fruits) { // for each loop / enhanced for loop
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.fill(fruits, "pineapple");
        for (String fruit : fruits) { // for each loop / enhanced for loop
            System.out.print(fruit + " ");
        }
        System.out.println();
        */

        // USER INPUT
        int numFood = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("What # of food do you want?: ");
        numFood = sc.nextInt();
        sc.nextLine();

        String[] foods = new String[numFood];
        for (int i = 0; i < numFood; i++) {
            System.out.print("Enter food: ");
            foods[i] = sc.nextLine();
        }

        System.out.print("You ordered ");
        for (String food : foods) {
            System.out.print(food + " ");
        }

        sc.close();
    }
}
