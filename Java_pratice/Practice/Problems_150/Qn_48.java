package Practice.Problems_150;

/*
48.
no=5
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
 */
public class Qn_48 {
    public static void invert_triangle(int num){
        for(int i = 1; i <= num; i++){
            for(int j = num + 1 - i; j >= 1; j--){
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
