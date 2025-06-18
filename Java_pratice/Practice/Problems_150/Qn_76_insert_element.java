package Practice.Problems_150;
import java.util.Arrays;

/*
76. Insert an element in an array
    Input: arr[] = [10, 20, 30, 40], pos = 3, ele = 50
    Output: [10, 20, 50,30, 40]
*/

public class Qn_76_insert_element{
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40};
        int pos = 3, ele = 50;
        System.out.println(Arrays.toString(insert_element(nums, pos, ele)));
    }
    public static int[] insert_element(int nums[], int pos, int ele) {
        int len = nums.length + 1, index = 0;
        int []arr = new int[len];
        for(int i = 0; i < len; i++){
            if(i == (pos - 1)){
                arr[i] = ele;
                continue;
            } 
            arr[i] = nums[index];
            index++;
        }
        return arr;
    }
}