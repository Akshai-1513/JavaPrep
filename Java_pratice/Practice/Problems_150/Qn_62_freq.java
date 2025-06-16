package Practice.Problems_150;


/*
62. Program to find the frequency count of every number in an array
Input={40,20,10,50,20,10,30,40}
        Output:
        40 -> 2
        20 -> 2
        10 -> 2
        50 -> 1
        30 -> 1
 */

import java.util.*;

public class Qn_62_freq {
    public static void main(String[] args) {
        int[] nums = {40,20,10,50,20,10,30,40};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " - > " + e.getValue());
        }
    }
}
