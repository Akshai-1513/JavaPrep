package Practice.Problems_150;

/*
68. Given an integer array find the duplicate element which has the longest distance
note: Assumed -1 as output if no duplicates are found
    int arr[]={1,2,3,1,3,4,2,5,6,1};
    O/p: 1
 */

public class Qn_68_Maximum_duplicate {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 3, 4, 2, 5, 6, 1, 6, 5};
        System.out.println(maximum_duplicate(nums));
    }

    static int maximum_duplicate(int[] nums) {
        int maxDistance = -1;
        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    int distance = j - i;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                        result = nums[i];
                    }
                    break;
                }
            }
        }

        return result;
    }
}
