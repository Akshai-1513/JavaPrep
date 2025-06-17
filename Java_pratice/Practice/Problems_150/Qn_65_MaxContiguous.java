package Practice.Problems_150;
/*
65. Max contiguous Subarray 
    Input:[-2, 1, -3, 4, -1, 2, 1, -5, 4]
    Output:6
    Explanation:-2
                -2,1
                -2,3,-1 so on
 */

public class Qn_65_MaxContiguous {
    public static void main(String[] args) {
            int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println(Max_contiguous(nums));
    }
    public static int Max_contiguous(int nums[]){
        int i = 0, j = 1;
        int global_max = 0, current_max = 0;
        while (j < nums.length) {
            current_max = Math.max(current_max + nums[j], nums[j]);
            global_max = Math.max(current_max, global_max);
            i++;
            j++;
            System.out.println();
        }
        return global_max;
    }
}