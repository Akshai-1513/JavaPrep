package Practice.OOPs.Interface.Extending_interface;

public interface A {
    void fun();

    default void fun_default(){
        System.out.println("This is default method.");
    }

    static void stat(){
        // Static method in the interface should always have the body.
        // If there is no body then it will show error.

        System.out.println("This is the static method.");
    }
}
