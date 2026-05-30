public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                if (Thread.currentThread().getName().equals("Thread-0")) {
                    System.out.println("ping...");
                } else {
                    System.out.println("PONG!");
                }
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Main thread was interrupted");
            }
        }
    }
}
