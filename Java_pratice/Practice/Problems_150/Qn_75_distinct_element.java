
import java.util.*;



/*
75. Find distinct elements in an array
    Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
    Output: {12, 10, 9, 45, 2}
*/

public class Qn_75_distinct_element{
    public static void main(String[] args) {
        int nums[] = {12, 10, 9, 45, 2, 10, 10, 45};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i : nums){
            set.add(i);
        }
        Integer[] array = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}