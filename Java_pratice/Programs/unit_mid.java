package Programs;

import java.util.Scanner;

public class unit_mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number :");
        int num = sc.nextInt();

        // This finds the unit digit of the number
        int unit_digit = num % 10;
        System.out.println("The unit unit digit of the number is " + unit_digit);

        int first_term = num;
        while (first_term > 0) {
            first_term = first_term / 10;
        }
        System.out.println("The first term of the number is " + first_term);

        // This finds the middle digit of the number
        // num = num / 10;

    }
}
