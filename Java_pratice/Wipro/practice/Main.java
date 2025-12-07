package Wipro.practice;

public class Main {
    static int Find_key1(int num1, int num2, int num3){
        int[] nums = {num1, num2, num3};
        int sumLarge = 0;
        int sumSmall = 0;
        for(int i : nums){
            int min = 9;
            int max = 0;
            while (i > 0){
                int rem = i % 10;
                if (rem < min) min = rem;
                if (rem > max) max = rem;
                i /= 10;
            }
            sumLarge += max;
            sumSmall += min;
        }
        return sumLarge - sumSmall;
    }

    static int Find_key2(int num1, int num2, int num3){
        int thousand_digit = num1 / 1000;
        int hundred_digit = (num2 / 100) % 10;
        int smallest_digit = 10;
        while(num3 > 0){
            int digit = num3 % 10;
            if(digit < smallest_digit) smallest_digit = digit;
            num3 /= 10;
        }
        return (thousand_digit * hundred_digit) + smallest_digit;
    }

    static String Find_key3(int num1, int num2, int num3){
        String result = "";
        while(num1 > 0){
            int min = 10;
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            int n3 = num3 % 10;

            min = (n1 < n2)? (n1 < n3)? n1 : n3 : (n2 < n3)? n2 : n3;
            result = min + result;

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return result;
    }

    static int Find_key4(int num1, int num2, int num3, int num4){
        int[] nums = {num1, num2, num3};
        int result = 0;
        for(int i : nums) {
            int min = 9;
            int max = 0;
            while (i > 0) {
                int rem = i % 10;
                if (rem < min) min = rem;
                if (rem > max) max = rem;
                i /= 10;
            }
            result += (max * min);
        }
        return result - num4;
    }

    static int Find_key5(int num1, int num2, int num3 , int num4){
        int[] nums = {num1, num2, num3};
        int res = 1;
        for(int i : nums) {
            int max = 0;
            while (i > 0) {
                int rem = i % 10;
                if (rem > max) max = rem;
                i /= 10;
            }
            res *= max;
        }
        return res + num4;
    }

    static int Find_key6(int num1, int num2, int num3, int num4){
        int res = 0;
        int[] nums = {num1, num2, num3};

        if(num4 % 2 == 0) {
            for (int i : nums) {
                while (i > 0) {
                    int rem = i % 10;
                    if(rem % 2 == 0) res += rem;
                    i /= 10;
                }
            }
        }

        else {
            for (int i : nums) {
                while (i > 0) {
                    int rem = i % 10;
                    if(rem % 2 != 0) res += rem;
                    i /= 10;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 37;
        System.out.println(Find_key6(input1,input2,input3,input4));
    }
}
