/*
82. Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
    Input: arr[] = [0, -1, 2, -3, 1], target = -2
    Output: 3 4
    Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -28
*/

public class Main
{
	public static void main(String[] args) {
	    int nums[] = {0, -1, 2, 1};
	    int target = -1;
	    target_element(nums, target);
	}
	public static void target_element(int nums[], int target){
	    int first_index = 0, last_index = 0;
	    int i = 0;
	    while(i < nums.length){
	        int j = nums.length - 1;
	        while(j > i){
	            if ((nums[i] + nums[j]) == target){
	                first_index = i;
	                last_index = j;
	                break;
	                }
	                j--;
	        }
	        i++;
	    }
	    System.out.println(first_index + "  " + last_index);
	}
}