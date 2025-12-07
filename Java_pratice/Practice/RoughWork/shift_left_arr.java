package Practice.RoughWork;

import java.util.*;
public class shift_left_arr
{
    public static void main(String[] args) {
        int len = 2;
        int[] arr = {2, 3, 3};
        System.out.println(Arrays.toString(shiftLeft(arr)));
    }
    public static int[] shiftLeft(int[] nums) {
        if(nums.length < 1) return nums;

        int val = nums[0];
        for(int i=1;i<nums.length; i++){
            nums[i - 1] = nums[i];
            if(nums[nums.length-1] == i)nums[i] = val;
        }
        return nums;
    }
}