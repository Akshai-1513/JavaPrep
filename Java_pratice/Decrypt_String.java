import javax.swing.*;
import java.util.Scanner;

public class Decrypt_String {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to decrypt : ");
        String str = sc. next();
        String new_str = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                if(i>0){
                int num = str.charAt(i) - '0';
                for(int j = 0;j< num;j++) {
                    new_str += str.charAt(i - 1);
                }
                }else
                    System.out.println("Error, the first character shouldn't be a digit.");
            }
            else
                new_str += str.charAt(i);
        }
        System.out.println("The decrypted String is : " + new_str);
    }
    */

//optimized version using the array , this prevent from the garbage value
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to decrypt : ");
        String str = sc. next();
        char arr[] = str.toCharArray();
        char result[] = new char[1000];
        int index = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                if (i > 0) {
                    int num = arr[i] - '0';
                    for (int j = 0; j < num; j++) {
                        result[index] = arr[i - 1];
                        index++;
                    }
                } else
                    System.out.println("Error, the first character shouldn't be a digit.");
            } else
                result[index] = arr[i];
        }
        System.out.print("The decrypted String is : " );
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }


}
