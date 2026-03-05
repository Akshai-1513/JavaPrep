package Programs;

import java.util.Arrays;

public class freq_without_map {
    public static void main(String[] args) {
        int[] nums = {2,4,3,5,7,4,7,4,25,3,2,23};
        int max = 0; //  25
        for(int i : nums) max = max > i ? max : i;

        int[] freq = new int[max + 1]; //26
        for(int i : nums) freq[i]++;

//        for (int i = 0; i <= max; i++){
//            if(freq[i] != 0) System.out.println(i + " -> " + freq[i]);
//        }

        System.out.println(Arrays.toString(nums));
        int index = 0;
        for(int i = 0; i <= max; i++){
            while(freq[i] > 0) {
                nums[index++] = i;
                freq[i]--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
