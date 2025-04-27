/*  Constraints:
        i) 0 < N <= 10,000
        ii) 0 <= array elements <= 10,00,000
        iii) The middle element is the element that exists at (lowest index + highest index) / 2

    Input Format:
        The first line of input contains an integer N, the size of the array.
        The second input line contains N integers, each separated by a single white space.

    Output Format:
        The output must display the middle element of the given array.*/
import java.util.Scanner;

public class Mid_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int arr[] = new int[array_length];

        for (int i = 0;i<array_length; i++){
            arr[i] = sc.nextInt();
        }
        int mid_element = (0 + (array_length-1)) /2;
        System.out.println(arr[mid_element]);
    }
}
