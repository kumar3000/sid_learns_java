import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // !  = NOT

        Scanner sc = new Scanner(System.in);
        String username;

        System.out.print("Enter a username: ");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be greater than 4 chars and less than 12 chars!");
        }

        sc. close();
    }
}
