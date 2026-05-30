public class Main {
    public static void main(String[] args) {
        // Multithreading = Enables a program to run multiple threads concurrently
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("Game START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Threads Interrupted before joining!");
        }

        System.out.println("Game over...");
    }
}
