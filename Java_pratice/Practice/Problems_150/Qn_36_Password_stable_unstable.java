package Practice.Problems_150;
import java.util.*;

/*
36. Find Password (stable unstable):

There is 5 input, we need to check whether the inputs are stable or unstable.
If the input is stable sum the value in the stable_sum.
else it is not stable sum the value in the unstable_sum.
Finally, find the result based on the difference between the stable and unstable.
 */


public class Qn_36_Password_stable_unstable {
    public int diff_stableOrunstable(int input1, int input2, int input3, int input4, int input5){
        int stable = 0, unstable = 0;
        if(find(input1)) stable += input1;
        else unstable += input1;

        if(find(input2)) stable += input2;
        else unstable += input2;

        if(find(input3)) stable += input3;
        else unstable += input3;

        if(find(input4)) stable += input4;
        else unstable += input4;

        if(find(input5)) stable += input5;
        else unstable += input5;

        int result = stable - unstable;
        return Math.abs(result);


    }

    public static boolean find(int num){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        int val = num;
        while(val > 0) {
            map.put(val % 10, map.getOrDefault(val % 10, 0) + 1);
            val /= 10;
        }

        int res = map.get(num % 10);
        while(num > 0){
            if(map.get(num % 10) == res) flag = true;
            else {
                flag = false;
                break;
            }
            num /= 10;
        }
        return flag;
    }
}
