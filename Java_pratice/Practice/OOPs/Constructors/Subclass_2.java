package Practice.OOPs.Constructors;

import Practice.OOPs.Acces_control.Subclass;


//public class Subclass_2 extends A{
//
//    public Subclass_2(int num, String str) {
//        super(num, str);
//    }
//
//    public static void main(String[] args) {
//        A obj = new A(30, "Hello World");
//
////        int n = obj.num;
//// This will show error because the num is protected it can't be accessed outside the package
//
//        Subclass obj2 = new Subclass(30, "Hello");
////        int n = obj2.num;
//
//        // Even with the subclasses we can't access the Protected variable ouside the package
//    }
//}


// In this program we can access the protected by extending the subclass.
class sub_class extends Subclass{
    public sub_class(int num, String str) {
        super(num, str);
    }

    public static void main(String[] args) {
        sub_class object = new sub_class(30,"My nigga");
        int num = object.num;
        System.out.println(num);
    }
}
