package Practice.Problems_150;

import java.util.Arrays;

/*
66. Rotate an array by ‘N’ positions
     Input:[1, 2, 3, 4, 5]
     N = 2
     Output:[3, 4, 5, 1, 2]
 */
public class Qn_66_rotate_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int N = 2;
        System.out.println(Arrays.toString(rotate_array(nums, N)));
    }
    public static int[] rotate_array(int[] nums, int N){
        int[] arr = new int[nums.length];
        if(N > nums.length) N = N % nums.length;
        int j = 0;
        for (int i = N; i < nums.length; i++){
            arr[j] = nums[i];
            j++;
        }
        for (int i = 0; i < N; i++){
            arr[j] = nums[i];
            j++;
        }
        return arr;
    }
}
