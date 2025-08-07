package Practice.OOPs.Interface.Nested_interface;

public class A {
    public interface function{
        void func();
    }
}

class B implements A.function{
    @Override
    public void func() {
        System.out.println("The result is printed.");
    }
}