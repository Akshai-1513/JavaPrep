/*
71. Minimum subarray sum
    Input: A = [3, 1, 2, 4]
    Output: 17
    Explanation:
    Subarrays are [3], [1], [2], [4], [3, 1], [1, 2], [2, 4], [3, 1, 2], [1, 2, 4], [3, 1, 2, 4].
    Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.
*/

public class Qn_71_min_subarray{
    public static void main(String[] args) {
        int nums[] = {3, 1, 2, 4};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++){
                int min = Integer.MAX_VALUE;
                for (int k = i; k <= j;k++) {
                    min = Math.min(nums[k], min);
                }
                sum += min;
            }
        }
        System.out.println(sum);
    }
}