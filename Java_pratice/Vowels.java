import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Charcter ");
        char Character = sc.next().charAt(0); // This is used to get the character

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' }; // Initialize the vowels in the array
        for (char vowel : vowels) {
            if (Character == vowel) { // If character is equal to any of the volwels returns vowels
                System.out.println("The character " + Character + " vowels ");
                break;
            } else { // Otherwise returns consonant
                System.out.println("The Character " + Character + " is consonant");
                break;
            }
        }
        sc.close();
    }
}
