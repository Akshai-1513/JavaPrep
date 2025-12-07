package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Unique_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String num_string = num + "";
        int[] arr = new int[num_string.length()];
        for(int i = 0; i<num_string.length();i++){
            arr[i] = num_string.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(arr));

        if(unique_value(arr) != -1)
            System.out.println("The unique element in the array is : " + unique_value(arr));

        else
            System.out.println("There is no unique element in the array.");

    }

    public static int unique_value(int arr[]){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num : arr){
            if (map.get(num) == 1)
                return num;
        }
        return -1;
    }
}
