package Practice.Problems_150;


/*
39. Create PIN using alpha, beta, gamma
    There are three inputs and the output should be single.
    Input:
        num1 = 123
        num2 = 582
        num3 = 175
    Output:
        PIN = 8122
*/


public class Qn_39_Generate_pin {
    public int PIN_generator(int input1, int input2, int input3){
        int num1 = input1, num2 = input2, num3 = input3;
        int min = 0, max = 0, val = 0;
        String result = "";
        while(num1 > 0){
            min = mini(num1 % 10, num2 % 10, num3 % 10);
            val = maxi(num1 % 10, num2 % 10, num3 % 10);
            max = (max > val)? max : val;
            result = min + result;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        result = max + result;
        return Integer.parseInt(result);
    }
    public static int mini(int a, int b, int c){
        return (a < b)? (a < c)? a : c : (b < c)? b : c;
    }
    public static int maxi(int a, int b, int c){
        return (a > b)? (a > c)? a : c : (b > c)? b : c;
    }
}
