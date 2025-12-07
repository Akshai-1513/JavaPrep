package Programs;

import java.util.Random;

public class HSC_percentage {
    public static void main(String[] args) {
        Random rad = new Random();
        int sub1 = rad.nextInt(100);
        System.out.println("The mark in the subject 5 is " + sub1);

        int sub2 = rad.nextInt(100);
        System.out.println("The mark in the subject 5 is " + sub2);

        int sub3 = rad.nextInt(100);
        System.out.println("The mark in the subject 5 is " + sub3);

        int sub4 = rad.nextInt(100);
        System.out.println("The mark in the subject 5 is " + sub4);

        int sub5 = rad.nextInt(100);
        System.out.println("The mark in the subject 5 is " + sub5);
        double Percentage = (sub1 + sub2 + sub3 + sub3 + sub4 + sub5) / 5;
        System.out.println("THe HSC Percentage is " + Percentage + "%");
    }
}