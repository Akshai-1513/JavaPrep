package Practice.Problems_150;

/*
53. Hour glass pattern
n=8

* * * * * * * *
 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *

 */

public class Qn_53_Hour_Glass {
    public static void Hour_glass(int num){
        for (int i = 1; i <= num; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++){
            for (int j = i; j < num; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        Hour_glass(num);
    }
}
