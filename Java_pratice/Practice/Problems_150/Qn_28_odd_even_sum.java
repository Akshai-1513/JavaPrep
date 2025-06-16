package Practice.Problems_150;


/*
28. Arrangement of odd sequence with count followed by even sequence with count
    i/p:361589
    o/p: 31594682
 */


public class Qn_28_odd_even_sum {
    public static String oddevencount(int num){
        String odd = "", even = "";
        while (num > 0) {
            int rem = num % 10;
            if(rem % 2 == 0) even = rem + even;
            else odd = rem + odd;
            num /= 10;
        }
        return odd + sum(Integer.parseInt(odd)) + even + sum(Integer.parseInt(even));
    }

    public static int sum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
