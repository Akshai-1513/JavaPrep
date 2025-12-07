package Practice.Collection;
import java.util.*;

public class Stack_collection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(20); // Insert the item on to the stack.
        s.push(10);
        s.push(40);

        s.clear(); // Removes all the items
        System.out.println(s);

        while(!s.isEmpty()){
            System.out.println(s.peek()); // Return the value whoch is on top of the stack
            s.pop(); // Remove te top item.
        }

    }
}
