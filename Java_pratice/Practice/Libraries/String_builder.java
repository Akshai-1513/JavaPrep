package Practice.Libraries;

/*
1. What is StringBuilder?
In Java:

String is immutable — once created, it cannot be changed.

StringBuilder is mutable — meaning it can be changed without creating a new object every time.
 */
public class String_builder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Hello ");
//        str.append(21); // storing the integer to the reference object.
//                        // Similarly for the float , long , double, char.
//        str.append(" World");
//        str.insert(5,7); // O/P : Hello7 21 World
//        str.delete(5, 9); // O/P : Hello World
//        str.reverse(); // O/P: dlroW olleH
//
//        System.out.println(str);

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" is fun");
        System.out.println("After append: " + sb);

        sb.insert(5, "really ");
        System.out.println("After insert: " + sb);

        sb.replace(5, 12, "super ");
        System.out.println("After replace: " + sb);

        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse();  // restore original
        sb.setCharAt(4, 'j');
        System.out.println("After setCharAt: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
