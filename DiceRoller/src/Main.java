import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int nDice;
        int total = 0;
        int roll;

        // get nDice
        do {
            System.out.print("Enter the # of dice to roll: ");
            nDice = sc.nextInt();
            if (nDice < 0) {
                System.out.println("Enter a positive integer.");
            }
        } while (nDice < 0);

        for (int i = 0; i < nDice; i++) {
            roll = rand.nextInt(1, 7);
            printDie(roll);
            System.out.println("You rolled " + roll);
            total += roll;
        }

        System.out.println("Total: " + total);

        sc.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}
