import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // varargs / variable arguments = allow a method to accept a varying # of args
        //                                makes methods more flexible, no need for overloads

        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(average(3, 4));
        System.out.println(average(3, 4, 5, 6, 7));
    }

    static int add(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    static double average (int... numbers) {
        double average = 0;
        double total = add(numbers);
        average = total / numbers.length;
        return average;
    }
}
