package Practice.OOPs.Polymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        Shapes obj1 = new Circle();
        Shapes obj2 = new Triangle();
        Shapes obj3 = new Square();

        obj1.print(); // This print the value in the child class.

        Shapes obj = new Shapes();
        obj.print();

    }
}
