package Practice.Problems_150;
import java.util.Arrays;

/*
77. Delete an element from an array
    Input: arr[] = [10, 20, 30, 40], pos = 2
    Output: [10, 30, 40]
*/

public class Qn_77_delete_element{
    public static void main(String[] args) {
        int []nums ={10, 20, 30, 40};
        int pos = 2;
        System.out.println(Arrays.toString(delete_element(nums, pos)));
    }
    public static int[] delete_element(int nums[] , int pos){
        int arr[] = new int[nums.length -1];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == pos -1) continue;
            arr[index] = nums[i];
            index++;
        }
        return arr;
    }
}