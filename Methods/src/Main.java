import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()
        Scanner sc = new Scanner(System.in);
        int age;
        String name;

        System.out.print("What's your name?: ");
        name = sc.nextLine();
        System.out.print("How old are you?: ");
        age = sc.nextInt();

        birthdaySong(name, age);
        birthdaySong(name, age);
        birthdaySong(name, age);

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        sc.close();
    }

    static void birthdaySong(String name, int age) {
        System.out.println("Happy birthday to you,");
        System.out.printf("Happy birthday dear %s,\n", name);
        System.out.printf("You are %d years old,\n", age);
        System.out.println("Happy birthday to you!");
    }
    static double square (int num) { return num * num; } // returns double

    static double add (double a, double b) { return a + b; }
    static double add (double a, double b, double c) { return a + b + c; } // overloaded method
}
