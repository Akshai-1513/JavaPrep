package Practice.Problems_150;

import java.util.Arrays;

/*
61. Group Reverse
    int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 }; d=2
    Expected OP: 30 20 10 45 35 25 50 40
 */
public class Qn_61_group_reverse {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 25, 35, 45,80,7, 84,48 ,90};
        int d = 4;
        System.out.println(Arrays.toString(group_reverse(nums, d)));
    }
    public static int[] group_reverse(int nums[], int d){
        int arr1[] = new int[nums.length];
        int  j = 0;
        for (int i = d; i >= 0; i--){
            arr1[j] = nums[i];
            j++;
        }
        for (int i = nums.length - 1; i >d; i--){
            arr1[j] = nums[i];
            j++;
        }
        return arr1;
    }
}
