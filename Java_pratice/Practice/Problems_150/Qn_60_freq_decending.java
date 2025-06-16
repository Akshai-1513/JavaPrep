import java.util.*;

/*
60. Frequency count with descending order printing 
int a[] = { 50, 20, 150, 20, 50, 10, 30, 10, 10 };  
*/

public class Qn_60_freq_decending {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = {50, 20, 150, 20, 50, 10, 30, 10, 10};
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        
        ArrayList<Integer> list = new ArrayList<>();
    }
}