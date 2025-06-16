package Practice.Problems_150;

/*
54. Pyramid pattern
    n = 4
        *
       ***
      *****
     *******
 */
public class Qn_54_pyramid {
    public static void pyramid(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num =5;
        pyramid(num);
    }
}
