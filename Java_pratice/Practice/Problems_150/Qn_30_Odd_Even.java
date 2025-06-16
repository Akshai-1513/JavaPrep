package Practice.Problems_150;


import java.util.Scanner;

/*
30. Problem to count the total number of odd and even in the given any digit number
   Input = 53467
   Ans:
        Odd=3
        Even=2
 */
public class Qn_30_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        odd_even(num);
    }
    static void odd_even(int num){
        int even = 0, odd = 0;
        while(num > 0){
            int rem = num % 10;
            if (rem % 2 == 0) even++;
            else odd++;
            num /= 10;
        }
        System.out.println("The even count : " + even + "\nThe Odd count : " + odd);
    }
}
