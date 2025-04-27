import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Unique_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str_num = Integer.toString(num);
        char arr[] = str_num.toCharArray();
        System.out.println(Arrays.toString(arr));

        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);

        for (int i = arr.length-1; i >=0; i--) {
            if(map.get(arr[i])==1) {
                System.out.println(map.get(arr[i]));
                return;
            }
        }
        System.out.println(-1);
    }
}
