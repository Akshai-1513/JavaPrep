package Programs;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) { // If the value is divisible by 3 and 5 returns FizzBuzz
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) { // If value is only divisible by 3 returns Fizz
            System.out.println("Fizz");
        } else if (number % 5 == 0) { // If value is only divisible by 5 returns Buzz
            System.out.println("Buzz");
        } else { // Otherwise print the number
            System.out.println(number);
        }
        sc.close();
    }
}
