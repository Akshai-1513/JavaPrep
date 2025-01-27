import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Charcter ");
        char Character = sc.next().charAt(0);

        char[] vowels = {'a' , 'e' , 'i' , 'o', 'u'};
        for (int i= 0;i<= vowels.length;i++ ){
            if( Character == vowels[i]) {
                System.out.println("The character " + Character + " vowels");
                break;
            }
            else {
                System.out.println("The Character " + Character + " is consonant");
                break;
            }
        }
        sc.close();
    }
}
