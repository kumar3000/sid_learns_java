import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PYTHAGOREAN THEOREM
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();

        System.out.print("b = ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("c = %.2f\n", c);

        scanner.close();
    }
}
