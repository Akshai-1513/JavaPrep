package Practice.OOPs.Interface;

public class Car1 implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("Brake is implemented in the car.");
    }

    @Override
    public void start() {
        System.out.println("The car is started.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerated.");
    }
}
