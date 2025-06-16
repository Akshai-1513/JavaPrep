package Practice.Problems_150;

/*

29. Program to reverse the number using a loop
    Ex: 143
    Output: 341

*/


public class Qn_29_reverse_no {
    int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev += (num % 10);
            num /= 10;
            if(num == 0) break;
            rev *= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Qn_29_reverse_no rev = new Qn_29_reverse_no();

        int num = 321;
        System.out.println(rev.reverse(num));
    }
}
