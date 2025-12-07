package Programs;

import java.util.*;

class Demo{
    public static void prac(){
    int num = 88422;
    String str = Integer.toString(num);
    for (int i = 0; i< str.length();i++){
        //code
    }
}
}
public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}