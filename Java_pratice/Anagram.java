
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st string : ");
        String input1 = sc.next();
        System.out.print("Enter the 2nd String : ");
        String input2 = sc.next();
        char[] arr1= input1.toCharArray();
        char[] arr2 = input2.toCharArray();

        if (arr1.length != arr2.length)
            System.out.println("The strings are not anagram.");
        else {
            if (Hash_map(arr1).equals(Hash_map(arr2))) {
                System.out.println("The Strings are anagrams");
            }
            else
                System.out.println("The Strings are not anagram.");
        }
    }
    public static HashMap<Character,Integer> Hash_map(char[] arr){
        HashMap<Character, Integer> map= new HashMap<>();
        for(char i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map;
    }
}
