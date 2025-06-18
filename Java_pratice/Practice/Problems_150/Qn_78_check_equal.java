package Practice.Problems_150;

import java.util.HashMap;

/*
78. Check if 2 Arrays are equal or not.
    Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
    Output: true
 */
public class Qn_78_check_equal {
    public static void main(String[] args) {
        int []nums1 = {1, 2, 5, 4, 0};
        int nums2[] = {2, 4, 5, 0, 1};
        System.out.println(twoArrEquals(nums1,nums2));
    }

    public static boolean twoArrEquals(int nums1[], int nums2[]){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int i : nums1){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for(int j : nums2){
            map2.put(j, map2.getOrDefault(j, 0) + 1);
        }


        return map1.equals(map2);
    }
}
