// MyThread.java

public class MyThread implements Runnable {
    private int init;
    private int increment;
    private int delay;

    // Constructor to initialize thread data
    public MyThread(int init, int increment, int delay) {
        this.init = init;
        this.increment = increment;
        this.delay = delay;
    }

    // Run method defines what the thread will execute
    public void run() {
        // Limiting to 5 iterations
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ": " + init);
                init += increment;
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished execution.");
    }
}
