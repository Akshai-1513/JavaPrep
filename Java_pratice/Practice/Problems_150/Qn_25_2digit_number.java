package Practice.Problems_150;

/*
    25. 2 digit reduced subtracted form
        Ex. 6928
        6-9= 3
        9-2=7
        2- 8=6
        O/p: 376
        Not 2 digit num
        Again perform RS
        3-7=4
        7-6=1
        O/P:41
 */


import java.util.Scanner;

public class Qn_25_2digit_number {
    public int sub_2_digit(int num){
        String val = "";
        int sub = 0, len = 0;
        while(true) {
            len = (num + "").length()-1;
            while (num > 10) {
                sub = (int) ((num / Math.pow(10, len)) % 10) - (int) ((num / Math.pow(10, len - 1)) % 10);
                if (sub < 0) sub = -1 * sub;
                val = val + sub;
                num %= (int) (Math.pow(10, len));
                len--;
            }
            if(val.length() <= 2) break;
            else{
                num = Integer.parseInt(val);
                sub = 0;
                val ="";
            }
        }
        return Integer.parseInt(val);
    }

    public static void main(String[] args) {
        Qn_25_2digit_number digit = new Qn_25_2digit_number();
        Scanner sc  =new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("The 2 digit reduced subtracted form : " + digit.sub_2_digit(num));
    }
}
