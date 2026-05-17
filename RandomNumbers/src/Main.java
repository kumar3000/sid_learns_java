import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Are you feeling lucky?");

        int dice1, dice2;
        dice1 = random.nextInt(1, 7);
        dice2 = random.nextInt(1, 7);
        System.out.println(dice1 + " " + dice2);
    }
}
