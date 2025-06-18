
import java.util.Arrays;

/*
72. Reverse an Array
    Input: arr = [4, 5, 2]
    Output: [2, 5, 4]
    Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
*/

public class Qn_72_reverse_array{
    public static void main(String[] args) {
        int nums[] = {4, 5, 2, 8};
        System.out.println(Arrays.toString(reverse_array(nums)));
    }
    public static int[] reverse_array(int[] nums){
        int i = 0, j = nums.length - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}