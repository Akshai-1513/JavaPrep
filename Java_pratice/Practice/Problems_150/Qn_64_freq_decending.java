package Practice.Problems_150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
64. Program to find the frequency count of every number in an array in descending order
    Input={40,20,10,50,20,10,30,40}
    40->2
    20->2
    10->2
    50->1
    30->1
*/

public class Qn_64_freq_decending {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = {50, 20, 150, 20, 50, 10, 30, 10, 10};
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}