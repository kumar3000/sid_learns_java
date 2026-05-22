import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target;
        String[] foods = {"apple", "pizza", "wings", "soda"};
        boolean found = false;

        System.out.print("Find: ");
        target = sc.nextLine();

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(target)) {
                System.out.println("Target found at index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target could not be found.");
        }
    }
}
