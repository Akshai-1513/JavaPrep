package Practice.Problems_150;


/*
37. Find the sum of Non-prime index value from an array.
 */


public class Qn_37_sum_non_prime_index {
    public static int sumOfNonPrime(int input1[], int input2){
        int sum = 0;
        for(int i = 0; i < input2; i++){
            if(i == 0 || i == 1) {
                sum += input1[i];
                continue;
            }
            if(!prime_number(i)) sum += input1[i];
        }
        return sum;
    }
    public static boolean prime_number(int num){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0) count++;
        }
        if(count == 1) return true;
        return false;
    }
}
