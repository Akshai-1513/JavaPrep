import java.util.Scanner;

public class Patterns {
    static void square_Patterns(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void right_triangle(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invert_right(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0;j< 2*i -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invert_pyramid(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n - (2*i +1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        static void diamond(int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0;j< 2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n-2; i >= 0; i--) {
                for (int j = 0; j<n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*i +1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        square_Patterns(num);
        right_triangle(num);
        invert_right(num);
        pyramid(num);
        invert_pyramid(num);
        diamond(num);
    }
}
