package Practice.Problems_150;

/*
33. Sum of Sums of Digits in Cyclic order
 */


public class Qn_33_sumDigits_Cyclic_order {
    static int sumOfDigitsCyclicOrder(int num){
        int val = num, count = 0, sum = 0;
        while(val > 0){
            val /= 10;
            count++;
        }

        while(num > 0){
            sum += SumOfDigits(num);
            num = num % (int)Math.pow(10, count - 1);
            count--;
        }
        return sum;
    }

    static int SumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 582109;
        System.out.println(sumOfDigitsCyclicOrder(num));
    }
}
