package Practice.Problems_150;


/*
Pattern Programs
41.  No=5
1 1 1 1 1
2       5
3       5
4       5
1 1 1 1 1
 */
public class Qn_41_box_pattern {
    public static void box_pattern(int num ){
        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num) System.out.print(1 + " ");
                else if(j == 1 ) System.out.print(i + " ");
                else if (j == num) System.out.print(num);
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        box_pattern(num);
    }
}
