package Practice.Collection;
import java.util.*;

public class Queue_Collection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // For queue we use the Linked list, there is no seerate collection for queue.
        queue.add(20);
        /*
            We can use the add or offer method to insert the value inside the queue.
            add - if the queue reaches it limit it throws exception.
            offer - it wont throw exception and it will show false.

            In most cases, offer() is preferred when working with bounded queues (like ArrayBlockingQueue) because it allows graceful handling when the queue is full.
         */

        queue.offer(30);
        queue.offer(70);
        queue.offer(60);

        System.out.println(queue);

        System.out.println(queue.peek()); //Returns the first val;

        while (!queue.isEmpty()){
            System.out.println(queue.poll()); // It return the top value and removes the previous value.

        }
    }
}
