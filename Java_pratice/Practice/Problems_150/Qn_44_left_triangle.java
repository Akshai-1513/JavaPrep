package Practice.Problems_150;

public class Qn_44_left_triangle {
    public static void left_trangle(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num -i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        left_trangle(num);
    }
}
