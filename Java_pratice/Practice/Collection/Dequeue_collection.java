package Practice.Collection;
import java.util.*;

public class Dequeue_collection {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        /*
            The deque is special kind of the queue that allows the data insert and remove from both the end.
            This deque is used as both queue and stack.

         */

        // For Stack

        System.out.println("For Stack : ");
        deque.offerFirst(20);
        deque.offerFirst(30);
        deque.offerFirst(40);

        while (!deque.isEmpty()) System.out.println(deque.pollFirst() );

        System.out.println();
        System.out.println("For Queue : ");
        // For queue
        deque.offerFirst(20);
        deque.offerFirst(30);
        deque.offerFirst(40);

        while (!deque.isEmpty()) System.out.println(deque.pollLast());

    }
}
