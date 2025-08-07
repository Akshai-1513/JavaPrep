package Practice.OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        System.out.println(obj1.b + " " + obj1.h+ " " + obj1.l );

        Child1 obj2 =new Child1(2,3,4,20);
        System.out.println(obj2.b + " " + obj2.h+ " " + obj2.l + " " + obj2.weight);

//        Box obj3 =new Child1(2,3,4,20);
//        System.out.println(obj3.b + " " + obj3.h+ " " + obj3.l + " " + obj3.weight);
//        The box is the parent class it cant able to access the variable in the chile class.
        Box obj3 = new Box(obj1);

        System.out.println(obj3.b + " " + obj3.h+ " " + obj3.l );

    }
}
