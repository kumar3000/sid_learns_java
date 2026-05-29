import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Time to countdown from: ");
        int response = sc.nextInt();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int countdownTime = response;

            @Override
            public void run() {
                System.out.println(countdownTime);
                countdownTime -= 1;
                if (countdownTime < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 0, 1000);
    }
}
