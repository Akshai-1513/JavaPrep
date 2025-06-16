package Practice.Problems_150;

public class Qn_57_2nd_largest {
    public static int second_largest(int nums[]){
        int max = 0;
        int sec_max = 0;

        for (int i : nums){
            max = (max > i)? max : i;
            if(sec_max < i){
                if(i < max) sec_max = i;
            }
        }
        return sec_max;
    }
}
