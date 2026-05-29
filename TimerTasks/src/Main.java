import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for: sending notis, scheduled updates, repetitive actions

        // TimerTask = Represents the task taht will be executed by the Timer
        //             You will extend the timertask class to define your task
        //             Create a subclass of TimerTask and @Override run()
        System.out.print("Running");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() { // Anonymous class, loading sim
            int count = 3;

            @Override
            public void run() {
                System.out.print(".");
                count--;
                if (count < 0) {
                    System.out.print("\r");
                    System.out.print("Running");
                    count = 3;
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
