package Practice.OOPs.Interface;

public class Main {
    public static void main(String[] args) {
//        Car1 car =  new Car1();
//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();
        //In this code we implemented 2 interface file into a single file
        // This is how the multiple inheritance work in the java.

        //But when I tried to access the third interface that has the same method as in the enine interface

        NiceCar car = new NiceCar();
        car.start();
        car.start_music();
        car.accelerate();
        car.stop_music();
        car.stop();
    }
}
