package Practice.Problems_150;


/*
45.
    no=5
    12345
    1234
    123
    12
    1
 */
public class Qn_45_invert_triangle {
    public static void invert_trangle(int num){
        for(int i = num; i >= 1; i--){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        invert_trangle(num);
    }
}
