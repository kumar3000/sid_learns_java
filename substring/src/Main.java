import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // .substring() = A method used to extract a portion of a string
        //                  .substring(start, end)
        String email;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println(username);
        System.out.println(domain);
    }
}
