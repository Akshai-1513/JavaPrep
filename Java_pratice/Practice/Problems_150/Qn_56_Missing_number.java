package Practice.Problems_150;

/*
56. Missing number in an array of shuffled order
    Input:[3, 7, 1, 2, 8, 4, 5]
    Output:6
 */
public class Qn_56_Missing_number {
    public static int missing_number(int nums[]){
        int nums_sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++){
            nums_sum += nums[i];
            max = (max > nums[i])? max : nums[i];
        }

        int actual_sum = 0;
        for (int i = 0; i <= max; i++){
            actual_sum += i;
        }
        return actual_sum - nums_sum;
    }
}
