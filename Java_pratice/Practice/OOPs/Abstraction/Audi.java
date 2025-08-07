package Practice.OOPs.Abstraction;

public class Audi extends Cars{

    @Override
    void start() {
        System.out.println("Th audi is started.");
    }

    void move() {
        System.out.println("The car started moving.");
    }
}
