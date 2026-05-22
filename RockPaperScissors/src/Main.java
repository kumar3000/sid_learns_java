import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] choices = {"rock", "paper", "scissors"};
        String cpuChoice;
        String playerChoice;
        String loop = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = sc.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Pick rock, paper, or scissors!");
                continue;
            }

            cpuChoice = choices[rand.nextInt(0, 3)];
            System.out.println("Computer choice: " + cpuChoice);

            switch (playerChoice) {
                case "rock" -> {
                    if (cpuChoice.equals("paper")) {
                        System.out.println("You lose...");
                    } else if (cpuChoice.equals("scissors")){
                        System.out.println("You win!");
                    }
                }
                case "paper" -> {
                    if (cpuChoice.equals("scissors")) {
                        System.out.println("You lose...");
                    } else if (cpuChoice.equals("rock")){
                        System.out.println("You win!");
                    }
                }
                case "scissors" -> {
                    if (cpuChoice.equals("rock")) {
                        System.out.println("You lose...");
                    } else if (cpuChoice.equals("paper")){
                        System.out.println("You win!");
                    }
                }
                default -> System.out.println("Tie!");
            }

            System.out.print("Play again (yes/no): ");
            loop = sc.nextLine().toLowerCase();
        } while (loop.equals("yes"));
    }
}
