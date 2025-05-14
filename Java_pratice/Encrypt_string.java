import java.util.Scanner;

public class Encrypt_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The decrypted string is : ");
        String str = sc.next();
        char char_arr[] = str.toCharArray();
        char result[] = new char[1000];
        int count = 1;
        int index= 0;

        for (int i = 1; i < char_arr.length; i++) {
                if(char_arr[i] == char_arr[i-1])
                    count++;
                else {
                    result[index++] = char_arr[i-1];
                    result[index++] = (char)(count +  '0');
                    count = 1;
                }
            }
        result[index++] = char_arr[char_arr.length - 1];
        result[index++] = (char)(count +  '0');

        System.out.print("The Encrypted string is : ");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
