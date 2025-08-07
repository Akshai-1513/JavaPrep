package Practice.OOPs.Acces_control;

public class Subclass extends A{

    public Subclass(int num, String str) {
        super(num, str);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(30, "Hello World");

        int n = obj.num;

        A obj2  = new A(35, "Yo Yo ");
        int num = obj2.num;

        // Here we can acces the num which is protected.
        // Because it can be accessed only inside the same package

        //look at the another example in the Contructors Subclass.java
    }
}
