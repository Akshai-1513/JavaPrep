package Programs;

import java.util.Scanner;

public class vowels_using_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String ch = sc.nextLine();

        for (int i = 0; i < ch.length(); i++) {
            char var = ch.charAt(i);
            if (var != ' ') {
                switch (Character.toLowerCase(var)) {
                    case 'a':
                        System.out.println("The character " + var + " is vowels");
                        break;
                    case 'e':
                        System.out.println("The character " + var + " is vowels");
                        break;
                    case 'i':
                        System.out.println("The character " + var + " is vowels");
                        break;
                    case 'o':
                        System.out.println("The character " + var + " is vowels");
                        break;
                    case 'u':
                        System.out.println("The character " + var + " is vowels");
                        break;
                    default:
                        System.out.println("The character " + var + " is consonant");
                        break;
                }
            }
        }
        sc.close();
    }
}
