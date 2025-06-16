package Practice.Problems_150;


/*
49.
    1
    10
    101
    1010
    10101
 */
public class Qn_49 {
    public static void binary_pattern(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                if(j % 2 == 0) System.out.print(0);
                else System.out.print(1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        binary_pattern(num);
    }
}
