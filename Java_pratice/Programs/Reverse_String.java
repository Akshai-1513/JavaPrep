package Programs;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the string : ");
        String str = sc.nextLine();
        System.out.println("The entered string is \"" + str + "\"");
        System.out.println("The reversed string is : " + reverse_str(str));
        sc.close();
    }
    public static String reverse_str(String str){
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            char rev = str.charAt(i);
            reverse = rev + reverse;
        }
        return reverse;
    }
}
