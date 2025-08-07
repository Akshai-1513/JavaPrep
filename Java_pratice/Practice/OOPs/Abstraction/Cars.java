package Practice.OOPs.Abstraction;

abstract class Cars {
    abstract void start();
    abstract void move();
    void stop(){
        System.out.println("The car is stoped");
    }
}
