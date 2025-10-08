package DSA.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    static void bubblesort(int[] nums){
        for(int index = 0; index < nums.length; index++){
            int i = 0, j = 1;
            while (j < nums.length){
                if(nums[i] > nums[j]) swap(nums, i, j);
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 2};
        bubblesort(nums);
    }
}
