import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String loop = "y";
        String[] symbols = {"\uD83C\uDF52", "\uD83C\uDF49", "\uD83C\uDF4B", "\uD83D\uDD14", "⭐"};
        double bet;
        double payout;
        double balance = 100;
        String spin1, spin2, spin3;

        System.out.println("***********777***********");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: \uD83C\uDF52 \uD83C\uDF49 \uD83C\uDF4B \uD83D\uDD14 ⭐");
        System.out.println("***********777***********");

        do {
            System.out.printf("Current balance: $%.2f\n", balance);
            System.out.print("Bet amount: $");
            bet = sc.nextDouble();
            if (bet > balance) {
                System.out.printf("You can't bet more %.2f!\n", balance);
                continue;
            }
            if (bet < 0) {
                System.out.println("You can't bet a negative number!");
                continue;
            }

            sc.nextLine();
            balance -= bet;

            // slot spin
            System.out.println("Spinning...");
            System.out.println("***********");
            spin1 = symbols[rand.nextInt(0, 5)];
            spin2 = symbols[rand.nextInt(0, 5)];
            spin3 = symbols[rand.nextInt(0, 5)];
            System.out.printf(" %s | %s | %s \n", spin1, spin2, spin3);
            System.out.println("***********");

            payout = calculateWin(spin1, spin2, spin3, bet);
            if (payout > 0) {
                System.out.printf("You won $%.2f!\n", payout);
                balance += payout;
            } else {
                System.out.println("No win.");
            }

            System.out.print("Play again? (Y/N): ");
            loop = sc.nextLine().toLowerCase();
        } while (loop.equals("y") && balance > 0);

        System.out.printf("GAME OVER! Final balance: $%.2f\n", balance);

        sc.close();
    }

    static double calculateWin(String spin1, String spin2, String spin3, double bet) {

        if (spin1.equals(spin2) && spin1.equals(spin3)) {
            return switch(spin1) {
                case "\uD83C\uDF52" -> bet * 3;
                case "\uD83C\uDF49" -> bet * 4;
                case "\uD83C\uDF4B" -> bet * 5;
                case "\uD83D\uDD14" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }

        if (spin1.equals(spin2) || spin2.equals(spin3)) {
            return switch(spin2) {
                case "\uD83C\uDF52" -> bet * 1;
                case "\uD83C\uDF49" -> bet * 2;
                case "\uD83C\uDF4B" -> bet * 3;
                case "\uD83D\uDD14" -> bet * 4;
                case "⭐" -> bet * 5;
                default -> 0;
            };
        }

        return 0;
    }
}
