import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements!
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.print("Give me a day: ");
        day = sc.nextLine();

        switch(day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a weekday.");
            case "saturday", "sunday" -> System.out.println("It is the weekend!");
            default -> System.out.println(day + " is not a day!");
        }
    }
}
