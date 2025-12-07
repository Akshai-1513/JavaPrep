package Practice.RoughWork;

import java.util.Scanner;

public class hasint {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("You have entered the number : " + num);
        }
        else System.out.println("You didn't enter an integer.");
    }
}
