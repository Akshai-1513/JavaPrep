package Practice.OOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
        Cars car = new Toyota();
        Cars car2 = new Audi();

        car.start();
        car.move();
        car.stop();
        System.out.println();
        
        car2.start();
        car2.move();
        car2.stop();
    }
}
