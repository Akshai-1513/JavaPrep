package Practice.Threads;

public class Thread1 extends Thread{
    public Thread1(){

    }

    // To give a title to the thread.
    public Thread1(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("The thread is running " + i + " time");
        }
    }
}