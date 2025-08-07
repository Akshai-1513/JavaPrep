package Practice.OOPs.Interface;

public class Power_Engine implements Engine{
    @Override
    public void start() {
        System.out.println("The powerEngine starts.");
    }

    @Override
    public void stop() {
        System.out.println("The powerEngine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("The powerengine is accelerated.");
    }
}
