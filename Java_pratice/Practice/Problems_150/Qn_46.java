package Practice.Problems_150;


/*
46.
    no=5
    12345
    2345
    345
    45
    5
 */

public class Qn_46 {
    public static void invert_triangle(int num){
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i-1 ;j ++){
                System.out.print(" ");
            }
            for(int j = i; j <= num; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        invert_triangle(num);
    }
}
