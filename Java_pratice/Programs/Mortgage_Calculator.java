package Programs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        final int Months_in_year = 12;
        final int Percent = 100;
        int no_of_months = 0;
        float monthlyinterest = 0;
        double R = 0;
        double mortage = 0;
        int principal = 0;
        float rate = 0;
        int year = 0;
        // The values are initialized

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter the value in the range of 1K to 1M");
        } // loops till the value of the principal is the valid range

        while (true) {
            System.out.print("Rate of Interest: ");
            rate = scanner.nextFloat();
            if (rate > 0 && rate <= 30) {
                monthlyinterest = rate / Percent / Months_in_year;
                break;
            }
            System.out.println("Enter the rate of interest between 1 to 30 percent");
        } // loops till the value of the rate is the valid range

        while (true) {
            System.out.print("Total time(years): ");
            year = scanner.nextInt();
            if (year > 0 && year < 30) {
                no_of_months = year * Months_in_year;
                break;
            }
            System.out.println("Enter the year from the range 0 to 30 years");
        } // loops till the value of the years is the valid range

        R = 1 + monthlyinterest;

        System.out.print("Mortage: ");
        mortage = principal * (monthlyinterest * Math.pow(R, no_of_months)) / ((Math.pow(R, no_of_months) - 1));
        // This is the formula to find the morgage calculator
        String mortage_in_currency = NumberFormat.getCurrencyInstance().format(mortage);
        // It the returns in the form pf the currency value
        System.out.print(mortage_in_currency);
        scanner.close();
    }
}