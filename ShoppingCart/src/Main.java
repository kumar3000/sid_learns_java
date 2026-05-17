import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What's the price?: ");
        price = scanner.nextDouble();

        System.out.print("How many items are you buying?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYour total is " + currency + total);

        scanner.close();
    }
}
