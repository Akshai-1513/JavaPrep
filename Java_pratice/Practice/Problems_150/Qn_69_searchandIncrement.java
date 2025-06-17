package Practice.Problems_150;

import java.util.ArrayList;
import java.util.Arrays;

/*
69. Given an integer array using searching element place the incremented number
next to searching number
    Input = {10,20,10,30,14,40,60,10}
    Search=10
    Output={10,1,20,10,2,30,14,40,60,10,3}
 */

public class Qn_69_searchandIncrement {
    public static void main(String[] args) {
        int nums[] = {10,20,10,30,14,40,60,10};
        int search = 10;
        System.out.println(Arrays.toString(SearchAndIncrement(nums, search)));
    }



    public static int[] SearchAndIncrement(int nums[], int search){
        ArrayList<Integer> list = new ArrayList<>();

        int count= 0;
        for(int i : nums){
            list.add(i);
            if(i == search) {
                count++;
                list.add(count);
            }
        }

        int arr[] = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
