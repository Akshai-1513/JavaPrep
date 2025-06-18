package Practice.Problems_150;

import java.util.ArrayList;
import java.util.Arrays;

/*
80. Leaders in an Array.
    Input: arr[] = [16, 17, 4, 3, 5, 2]
    Output: [17 5 2]

    Explanation:
    17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a
    leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader.
    2 has no element to its right, therefore 2 is a leader.
 */
public class Qn_80_Leaders {
    public static void main(String[] args) {
        int nums[] = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(Leaders(nums)));
    }
    public static int[] Leaders(int nums[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j]) break;
                if(nums[i] > nums[j] && j == nums.length -1){
                    list.add(nums[i]);
                }
            }
        }
        list.add(nums[nums.length -1]);

        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
