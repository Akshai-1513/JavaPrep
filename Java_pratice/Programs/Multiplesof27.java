package Programs;

import java.util.Scanner;

public class Multiplesof27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num % 27 == 0)
            System.out.println(num + " is a multiple of 27");
        else
            System.out.println(num + " is not a multiple of 27");
        sc.close();
    }
}