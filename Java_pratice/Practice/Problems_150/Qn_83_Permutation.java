package Practice.Problems_150;
/*
3. Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
    Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/

import java.util.*;

public class Qn_83_Permutation {
    public static void permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) continue;
                for (int k= 0; k < nums.length;k++){
                    if(nums[k] == nums[i] || nums[k] == nums[j]) continue;
                    int arr[] = new int[nums.length];
                    int index = 0;
                    arr[index] = nums[i];
                    index++;
                    arr[index] = nums[j];
                    index++;
                    arr[index] = nums[k];
                    List<Integer> list = ArraytoList(arr);
                    res.add(list);
                }
            }
        }
        System.out.println(res);
    }


    static List<Integer> ArraytoList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        return list;
    }
    static void swap (int[] nums, int j, int k){
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3};
        permute(nums);
    }

}