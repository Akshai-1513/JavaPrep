package Programs;/*
second max element.
    input : nums[] =  [27, 33, 35, 35, 39, 20]
    output : [35, 35]
 */

import java.util.*;

public class second_max {
    public static void main(String[] args) {
        int nums[] = {27, 33, 33, 39, 20};
        System.out.println(Arrays.toString(sec_max(nums)));
    }
    static Object[] sec_max(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i :  nums){
            if(i > first_max){
                second_max = first_max;
                first_max = i;
            }
        }
        for(int i : nums){
            if (i == second_max) list.add(i);
        }

        Object[] arr = list.toArray();
        return arr;
    }
}
