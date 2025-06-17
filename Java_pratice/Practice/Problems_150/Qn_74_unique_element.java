package Practice.Problems_150;

import java.util.*;

/*
4. Finding frequency of Unique elements in an array
    Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
    Output : 5   1
 */
public class Qn_74_unique_element {
    public static void main(String[] args) {
        int[] nums= {10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i , 0)+ 1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey() + " - > " + entry.getValue());
            }
        }
    }
}
