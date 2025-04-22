// Name: Parnika Jain
// PRN: 23070126087
// Batch: B1


// Main.java

public class Main {
    public static void main(String[] args) {
        // Creating threads with different parameters
        Thread t1 = new Thread(new MyThread(0, 2, 2000), "Thread-1");
        Thread t2 = new Thread(new MyThread(1, 3, 3000), "Thread-2");
        Thread t3 = new Thread(new MyThread(100, 50, 1000), "Thread-3");

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
