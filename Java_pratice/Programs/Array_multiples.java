package Programs;

import java.util.Arrays;

public class Array_multiples {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i< arr1.length;i++){
            arr2[i] = 2 * arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
