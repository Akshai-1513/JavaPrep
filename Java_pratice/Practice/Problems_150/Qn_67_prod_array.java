package Practice.Problems_150;/*
67. Given an array of integers, return a new array such that each element at index i of 
the new array is the product of all the numbers in the original array except the one 
at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be
    [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6]
 */

import java.util.Arrays; 

public class Qn_67_prod_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 5};
        System.out.println(Arrays.toString(prod_array(nums)));
    }    
    static int[] prod_array(int nums[]){
        int[] arr = new int[nums.length];
        int index= 0;
        int product = 1, zero_count = 0;
        
        for(int i : nums){
            if(i == 0) {
                zero_count++;
                continue;
            }
            product *= i;
        }

        for(int i : nums){
            if(zero_count > 1) return arr;
            else if (zero_count == 1) {
                if(i == 0) arr[index] = product;
                else arr[index] = 0;
                index++;
            }
            else{
                arr[index] = product / i;
                index++;
            }
        }
        return arr;
    }
}
