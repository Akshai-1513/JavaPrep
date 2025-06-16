package Practice.Problems_150;


/*
27. Arrangement of odd sequence followed by even sequence
    i/P:361589
    o/p: 315968
 */


public class Qn_27_odd_and_even_seq {
    public static String OddAndEvenSequence(int num) {
        String odd = "", even = "";
        while (num > 0) {
            int rem = num % 10;
            if(rem % 2 == 0) even = rem + even;
            else odd = rem + odd;
            num /= 10;
        }
        return odd + even;
    }

    public static void main(String[] args) {
        int num = 31254;
        System.out.println(OddAndEvenSequence(num));
    }
}
