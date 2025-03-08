import java.util.Scanner;

public class Stepping_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b = 0, sub = 0;
        boolean flag = true;
        a = num % 10;
        num /= 10;

        while(num != 0) {
            b = num % 10;
            sub = b - a;
            sub = Math.abs(sub);
            num /= 10;
            a = b;

            if (sub != 1) {
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("The number is stepping number");
        else
            System.out.println("The number is not stepping number");
    }
}
