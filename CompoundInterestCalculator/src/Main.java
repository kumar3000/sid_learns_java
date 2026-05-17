import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // COMPOUND INTEREST CALCULATOR
        Scanner sc = new Scanner(System.in);
        double amount;
        double principle;
        double rate;
        int nCompounds;
        int years;

        System.out.print("Principle amount P: ");
        principle = sc.nextDouble();

        System.out.print("Interest rate in %: ");
        rate = sc.nextDouble() / 100;

        System.out.print("Times compounded per year: ");
        nCompounds = sc.nextInt();

        System.out.print("Years: ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + rate / nCompounds, nCompounds * years);
        System.out.printf("Amount after %d years is $%.2f", years, amount);

        sc.close();
    }
}
