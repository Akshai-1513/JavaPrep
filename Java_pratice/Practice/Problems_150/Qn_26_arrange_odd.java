package Practice.Problems_150;


/*
26. Program to print the sum of odd numbers and arrangement of odd sequence
    input : 361589
    output : 18, 3159.

 */


public class Qn_26_arrange_odd {
    public static int odd_sequence(int num){
        int temp = num;
        int sequence = 0;
        int len = (num + "").length()-1;
        while (temp > 0){
            int rem = temp / (int)Math.pow(10,len);
            if(rem % 2 != 0){
                sequence += rem;
                if(temp < 100) break;
                sequence *= 10;
            }
            temp %= (int)Math.pow(10,len);
            len--;
        }
        return sequence;
    }

    public static int sum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 31254;
        int odd_seq = odd_sequence(num);
        System.out.println(odd_seq);
        System.out.println(sum(odd_seq));
    }
}
