import java.util.*;

/*
 * 59. Remove all duplicates in an array sample input and output 
        Input:[1, 2, 2, 3, 4, 4, 5] 
        Output:[1, 2, 3, 4, 5] 
 */
public class Qn_59_remove_duplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for(int i :  nums){
            set.add(i);
        }
       System.out.println(set);
    }

}
