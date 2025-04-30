import java.util.Arrays;
import java.util.Scanner;

public class String_prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the string : ");
        String str = sc.next();
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println("The ASCII value of the String : " + Arrays.toString(arr));
        System.out.print("The Prime numbers from the string are : ");

        for (int i = 0; i < arr.length; i++) {
            if (is_prime_number(arr[i])){
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("The sum of the prime numbers in java is : " + sum);
    }

    public static boolean is_prime_number(int x){
        int count = 0;
        if(x == 1 || x == 0)
            return false;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0)
                count++;
        }
        if(count == 0)
            return true;
        else
            return false;
    }
}
