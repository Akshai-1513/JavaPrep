package Practice.Problems_150;
/*
65. Max contiguous Subarray 
    Input:[-2, 1, -3, 4, -1, 2, 1, -5, 4]
    Output:6
    Explanation:-2
                -2,1
                -2,3,-1 so on
 */

public class Qn_70_MaxSubarraySum {
    public static void main(String[] args) {
            int nums[] = {2, 3, -8, 7, -1, 2, 3};
            System.out.println(Max_contiguous(nums));
    }
    public static int Max_contiguous(int nums[]){
        int j = 1;
        int global_max = nums[0], current_max = nums[0];
        while (j < nums.length) {
            current_max = Math.max(current_max + nums[j], nums[j]);
            global_max = Math.max(current_max, global_max);
            j++;
        }
        return global_max;
    }
}