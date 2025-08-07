package Practice.OOPs.Interface.Extending_interface;

public class Main implements B{
    @Override
    public void greet() {
        // This abstract method is in interface B.
    }

    @Override
    public void fun() {
        // This abstract is in the interface A.
    }


    public static void main(String[] args) {
        A.stat();
        // This how the interface is called
    }
}
