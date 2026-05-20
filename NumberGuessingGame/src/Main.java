import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int min = 0;
        int max = 100;
        int guess = min - 1;
        int attempts = 0;
        int randomNumber = rand.nextInt(min, max + 1);

        while (guess != randomNumber) {
            do {
                System.out.printf("Enter a guess %d-%d: ", min, max);
                guess = sc.nextInt();
            } while (guess < min || guess > max);
            attempts++;

            if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again.");
            } else {
                System.out.printf("You won in %d attempts!\n", attempts);
            }
        }

        sc.close();
    }
}
