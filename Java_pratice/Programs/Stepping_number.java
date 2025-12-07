package Programs;

import java.util.Scanner;

public class Stepping_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (stepping_n(num))
            System.out.println("The number is stepping number");
        else
            System.out.println("The number is not stepping number");
        sc.close();
    }
    static  boolean stepping_n(int num){
        if(num < 10) return true;
        int condition = 1;
        return true;
    }
}
