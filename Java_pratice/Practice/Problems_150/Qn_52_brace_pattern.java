package Practice.Problems_150;


/*
 Print braces pattern program
int n=2
Output:
{ }
{ } {{ }}
 */
public class Qn_52_brace_pattern {
    public static void brace_pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                for (int k = 0; k < j; k++) {
                    System.out.print("{");
                }
                for (int k = 0; k < j; k++) {
                    System.out.print("}");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        brace_pattern(5);
    }
}

