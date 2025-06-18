package Practice.Problems_150;

import java.util.ArrayList;
import java.util.Arrays;

/*
81. Find common elements between 2 arrays.
    Input :  a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
    Output : {1,  3, 1}
 */
public class Qn_81_common_element {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};
        System.out.println(Arrays.toString(common_element(a, b)));
    }
    public static int[] common_element(int a[], int b[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    list.add(a[i]);
                    b[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int nums[] = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
