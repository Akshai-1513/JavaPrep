package Practice.Threads;

public class DaemonThread {
    public static void main(String[] args) {
        System.out.println("The user thread is started its execution.");
        Thread t1 = new Thread1();
        t1.setDaemon(true);
        t1.start();

        System.out.println("The user thread is exiting.");

    /* Output:
            The user thread is started its execution.
            The user thread is exiting.

            In this program the t1 is the daemon thread if the user thread finishes it's execution the whole program will be terminated.
     */

        // There is no particular order for the thread execution.
    }
}
