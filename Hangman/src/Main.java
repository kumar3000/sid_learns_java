import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARS //
        String word = "";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        // READ WORD BANK & ASSIGN RANDOM WORD //
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

            Random random = new Random();
            word = words.get(random.nextInt(0, words.size()));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("IO Exception!");
        }

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        // INTRO //
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        // GAME LOOP //
        while (wrongGuesses < 6) {

            // Print current game state
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println(getHangmanArt(wrongGuesses));

            // Guess and check
            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) != -1) {
                System.out.println("Correct guess!\n");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
            } else {
                System.out.println("Wrong guess!\n");
                wrongGuesses += 1;
            }

            // Win check
            if (!wordState.contains('_')) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("You win!");
                break;
            } else if (wrongGuesses == 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("GAME OVER\nThe word was " + word + "!");
                break;
            }
        }

        sc.close();
    }

    // ASCII ART, displays hangman for # of wrong guesses //
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                    
                      """;
            case 4 -> """
                       o
                      /|\\
                    
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}
