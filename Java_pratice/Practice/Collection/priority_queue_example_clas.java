package Practice.Collection;
import java.util.*;

public class priority_queue_example_clas implements Comparable<priority_queue_example_clas>{
    private int id;
    private int age;

    public priority_queue_example_clas(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    /*
        If the example class isn't implemented with the Comparable interface it will throw error.

        Exception in thread "main" java.lang.ClassCastException: class Practice.Collection.priority_queue_example_clas cannot be cast to class java.lang.Comparable (Practice.Collection.priority_queue_example_clas is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
            at java.base/java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:643)
            at java.base/java.util.PriorityQueue.siftUp(PriorityQueue.java:639)
            at java.base/java.util.PriorityQueue.offer(PriorityQueue.java:330)
            at Practice.Collection.priority_queue.main(priority_queue.java:18)
    */

    /*
        Comparale :
            Comparable is an interface in Java (in the java.lang package) that is used to define the natural ordering of objects.
            It allows objects of a class to be compared to each other, mainly for sorting (e.g., in Collections.sort() or PriorityQueue).
     */

    public int compareTo(priority_queue_example_clas o) {
        /*
            The sorting is based on the 3 insances :
                if(this.id < o.id) return -1;
                if(this.id > o.id) return +!;
                if(this.id == o.id) return 0;

             Instead of using those three instances we can use,
                return this.id - o.id;
         */
//        return this.id - o.id; Ascending order.
        return o.id - this.id; // for Decending order.
    }

    @Override
    public String toString() {
        return "id : " + id + " age : " + age;
    }


}
