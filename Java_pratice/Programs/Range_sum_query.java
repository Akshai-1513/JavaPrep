package Programs;/*303. Range Sum Query - Immutable   Solved
Easy
        Topics
Companies
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).


Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
        [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

import java.util.Arrays;
import java.util.Scanner;*/

class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int prefix_sum = 0;
        for (int i = left; i <= right; i++) {
            prefix_sum += nums[i];
        }
        return prefix_sum;
    }
}

//public  class Range_sum_query {
//    public static void main(String args[]){
//        Scanner sc =new Scanner(System.in);
//        int arr_size = sc.nextInt();
//        int[] nums = new int[arr_size];
//        for(int i = 0; i< arr_size;i++){
//            nums[i] = sc.nextInt();
//        }
//        NumArray num_arr = new NumArray(nums);
//        int left = sc.nextInt();
//        int right = sc.nextInt();
//        int sum = num_arr.sumRange(left,right);
//        System.out.println(Arrays.toString(nums));
//        System.out.println("The sum of the array is : " + sum );
//    }
//}

