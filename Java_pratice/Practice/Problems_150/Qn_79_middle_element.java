package Practice.Problems_150;
/*
79. Middle Element in an array.
    Input: arr = {1, 2, 3, 4, 5}
    Output: 3

    Input: arr = {7, 8, 9, 10, 11, 12}
    Output: 9 10
 */
public class Qn_79_middle_element {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        middle_element(nums);
    }
    public static void middle_element(int nums[]){
        int len = nums.length;
        if(len % 2 == 0) System.out.println(nums[len/2 - 1] + " " + nums[len/2]);
        else System.out.println(nums[len/2]);
    }
}
