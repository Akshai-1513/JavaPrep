package Practice.Problems_150;


/*
50.
    No-5
    E D C B A
      D C B A
        C B A
          B A
            A
 */
public class Qn_50 {
    public static void alpha_tiangle(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = num - i; j >= 1; j--){
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        alpha_tiangle(num);
    }
}
