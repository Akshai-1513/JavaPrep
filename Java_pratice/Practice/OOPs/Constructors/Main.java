package Practice.OOPs.Constructors;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.b + " " + b1.h + " " + b1.l);

        Box b2  = new Box(100, 20, 40);
        System.out.println(b2.b + " " + b2.h + " " + b2.l);

        Box b3 = new Box(b2);

        System.out.println(b3.b + " " + b3.h + " " + b3.l);
    }
}
