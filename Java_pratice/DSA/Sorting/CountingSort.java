package DSA.Sorting;

public class CountingSort {
    public void count_sort(int nums[], int len) {
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
}
