package Practice.RoughWork;

public class char_arr {
    public static void main(String[] args) {
        char[] arr = {'a', 'd', 'f', 't'};
        char letter = 'e';
        for(char c : arr) {
            if(c < letter) System.out.println(c);
        }
    }
}
