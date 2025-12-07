package Practice.Collection;
import java.util.*;

public class priority_queue {
    public static void main(String[] args) {


        PriorityQueue<Integer> p1 = new PriorityQueue<>();

        p1.offer(50);
        p1.offer(40);
        p1.offer(30);

        while (!p1.isEmpty()) System.out.println(p1.poll());

        List<priority_queue_example_clas> list = new ArrayList<>();

        list.add(new priority_queue_example_clas(1, 20));
        list.add(new priority_queue_example_clas(2, 39));
        list.add(new priority_queue_example_clas(3, 30));

        PriorityQueue<priority_queue_example_clas> p2 = new PriorityQueue<>(list);

        List<priority_queue_example_clas> top2val = new ArrayList<>();
        int index = 0;
        while(!p2.isEmpty()) {
            if(index == 3) break;
            top2val.add(p2.poll());
            index++;
        }

        System.out.println(top2val);

        /*
        If the example class isn't implemented with the Comparable interface it will throw error.

        Exception in thread "main" java.lang.ClassCastException: class Practice.Collection.priority_queue_example_clas cannot be cast to class java.lang.Comparable (Practice.Collection.priority_queue_example_clas is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
            at java.base/java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:643)
            at java.base/java.util.PriorityQueue.siftUp(PriorityQueue.java:639)
            at java.base/java.util.PriorityQueue.offer(PriorityQueue.java:330)
            at Practice.Collection.priority_queue.main(priority_queue.java:18)
         */

    }
}
