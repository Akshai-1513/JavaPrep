package Practice.Problems_150;


/*
42.
    1
    0 0
    1 1 1
    0 0 0 0
    1 1 1 1 1
 */


public class Qn_42_01_right_triangle {
    public static void right_triangle(int num){
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                if(i % 2 == 0) System.out.print(0 + " ");
                else System.out.print(1 + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num = 5;
        right_triangle(num);
    }
}
