package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Find_single {

    static int[] rad_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int loop = sc.nextInt();
        int[] arr = new int[loop];
        System.out.println("The number array element ");

        for (int i = 0; i < loop; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int single(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR approach
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = rad_array();
        System.out.println(Arrays.toString(arr));
        int ans = single(arr);
        System.out.println(ans);
    }
}
