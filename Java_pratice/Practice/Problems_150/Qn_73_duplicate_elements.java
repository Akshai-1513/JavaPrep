package Practice.Problems_150;

import java.util.*;

/*
73. Finding Frequency of Duplicate elements in an array
Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
 */
public class Qn_73_duplicate_elements {
    public static void main(String[] args) {
        int nums[] = {10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() +" -> " + entry.getValue());
            }
        }
    }

}
