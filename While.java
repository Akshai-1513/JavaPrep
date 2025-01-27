import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = ""; // Empty class is initiated

        while (!input.equals("quit")) { // It will iterate till we enter the string "quit"
            System.out.print("Input : ");
            input = sc.next().toLowerCase(); // The input string is converted to lowercase
            System.out.println(input);
        }
        sc.close();
    }
}
