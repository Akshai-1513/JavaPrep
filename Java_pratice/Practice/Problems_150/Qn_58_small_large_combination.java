/*
 * 58. Re-arranged array by small – largest combination 
        Input: [1, 3, 5, 2, 8, 7, 4] 
        Output:[1, 8, 2, 7, 3, 5, 4]
 */
import java.util.*;

public class Qn_58_small_large_combination{
    public static void main(String[] args) {
        int []nums = {1, -3, -5, 2, 8, 7, 4};
        System.out.println(Arrays.toString(combination(nums)));
    }

    public static int[] combination(int nums[]){
        int []arr = new int[nums.length];
        Arrays.sort(nums);
        int max = nums.length -1;
        int min = 0;
        int i = 0;
        while(max >= min) {
            if (i % 2 == 0) {
                arr[i] = nums[min];
                min++;
                i++;
            }
            else{
                arr[i] = nums[max];
                max--;
                i++;
            }
        }
        return arr;
    } 
}