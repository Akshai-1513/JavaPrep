package DSA.Sorting;

import java.util.Arrays;

public class CountingSort {
    public void count_sort_positive_values(int nums[], int len) {
        int max = nums[0];
        for (int i : nums) max = (max > i) ? max : i;

        int[] freq = new int[max + 1];
        for (int i : nums) freq[i]++;

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (freq[i] > 0) {
                nums[index] = i;
                index++;
                freq[i]--;
            }
        }
    }

    static void count_sort_PandN(int nums[]){
        int min = nums[0], max = nums[0];
        for(int i : nums) {
            min = (min > i) ? i : min;
            max = (i > max) ? i : max;
        }
        int len = max - min + 1;
        int[] freq = new int[len];
        for(int i : nums) {
            freq[i - min]++;
        }
        System.out.println("The frequency array = " + Arrays.toString(freq));
        int index = 0;
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){

                nums[index++] = i + min;
                freq[i]--;
            }
        }
        System.out.println("The sorted array = " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = {-2,-2,-3,2,2,1,1,1,2,2};
        System.out.println("The original array = " + Arrays.toString(nums));
        count_sort_PandN(nums);
    }
}
