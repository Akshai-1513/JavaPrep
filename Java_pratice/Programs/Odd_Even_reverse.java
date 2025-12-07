package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Odd_Even_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        char[] arr = input1.toCharArray();
        System.out.println(Arrays.toString(arr));
        String input2 = sc.next().toLowerCase();
        if (input2.equals("odd")) {
            int i = 1, j = input1.length() - 1;
            while (j > i) {
                if (i % 2 != 0 && j % 2 != 0)
                    swap(arr, i, j);
                i++;
                j--;
            }
        } else {
            int i = 1, j = input1.length() - 1;
            while (j > i) {
                if (i % 2 == 0 && j % 2 == 0)
                    swap(arr, i, j);
                i++;
                j--;
            }
        }
        String reverse = String.valueOf(arr);
        System.out.println(reverse);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
