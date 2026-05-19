import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;
        double result = 0;
        boolean isValid = true;
        char operator;
        // parse x _ y where x and y are doubles and _ is the operator
        System.out.print("x = ");
        x = sc.nextDouble();
        System.out.print("operator = ");
        operator = sc.next().charAt(0);
        System.out.print("y = ");
        y = sc.nextDouble();

        switch(operator) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> {
                if (y == 0) {
                    isValid = false;
                    System.out.println("Cannot divide by 0");
                } else {
                    result = x / y;
                }
            }
            case '%' -> result = x % y;
            case '^' -> result = Math.pow(x, y);
            default -> {
                isValid = false;
                System.out.println("Invalid operation");
            }
        }

        if (isValid) {
            System.out.println(result);
        }

        sc.close();
    }
}
