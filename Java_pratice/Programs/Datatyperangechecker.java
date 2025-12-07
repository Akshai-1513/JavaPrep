package Programs;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) // Checks the minimum and amximum value in byte
                    System.out.println("* byte");

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) // Checks the minimum and amximum value in short
                    System.out.println("* short");

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) // Checks the minimum and amximum value in int
                    System.out.println("* int");

                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) // Checks the minimum and amximum value in long
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
