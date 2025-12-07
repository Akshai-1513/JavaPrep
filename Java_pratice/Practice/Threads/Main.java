package Practice.Threads;

public class Main{
    public static void main(String[] args) {
        System.out.println("The user thread is started its execution.");

        Thread t1 = new Thread1();
        t1.start(); // This line tell to start the process by executing the run method.
        // This tells the java, to run the process if it got time to run.

        System.out.println("The user thread is exiting.");

        /* Output:
                The user thread is started its execution.
                The user thread is exiting.
                The thread is running 1 time
                The thread is running 2 time
                The thread is running 3 time
                The thread is running 4 time
                The thread is running 5 time
         */  // There is no particular order for the thread execution.
    }
}
