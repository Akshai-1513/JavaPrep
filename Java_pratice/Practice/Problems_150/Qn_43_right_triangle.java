package Practice.Problems_150;


/*
43.
                              no=5
     1
     12
     123
     1234
     12345
 */


public class Qn_43_right_triangle {
    public static void right_triangle(int num){
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        right_triangle(5);
    }
}
