package Practice.Problems_150;

public class Qn_55_Diamond_pattern {
    public static void Diamond_pattern(int num){
        for (int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++){
            for (int j = 2; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = num - i + 1; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        Diamond_pattern(num);
    }
}
