
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // How to PLAY AUDIO with Java (wav, au, aiff)
        Scanner sc = new Scanner(System.in);
        String filePath;

        System.out.print("File: ");
        filePath = sc.nextLine();

        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) { // using try with resources automatically closes things inside parentheses

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = Play\nS = Stop\nR = Reset\nQ = Quit");
                System.out.print("Enter your choice: ");
                response = sc.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> {
                        System.out.println("Playing audio...");
                        clip.start();
                    }
                    case "S" -> {
                        System.out.println("Stopping audio...");
                        clip.stop();
                    }
                    case "R" -> {
                        System.out.println("Restarting audio...");
                        clip.setMicrosecondPosition(0);
                    }
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice.");
                }
            }
        }

        // catch blocks
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch (IOException e) { // safety net
            System.out.println("IO exception");
        }
        finally {
            System.out.println("Bye!");
            sc.close();
        }
    }
}
