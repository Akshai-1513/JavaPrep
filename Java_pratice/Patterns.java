import java.util.Scanner;

public class Patterns {
    static void square_Patterns(int n) {
        System.out.println("Square Patterns: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void right_triangle(int n) {
        System.out.println("Right Triangle Pattern : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void invert_right(int n) {
        System.out.println("Inverted Right Triangle Pattern: ");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pyramid(int n) {
        System.out.println("Pyramid Pattern : ");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void invert_pyramid(int n) {
        System.out.println("Inverted Pyramid Pattern : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void diamond(int n) {
        System.out.println("Diamond Pattern : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hollow_square(int n) {
        System.out.println("Hollow Square Pattern : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    static void hollow_right_triangle(int n) {
        System.out.println("Hollow Right Triangle Pattern : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == n - 1 || j == 0 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // square_Patterns(num);
        // right_triangle(num);
        // invert_right(num);
        // pyramid(num);
        // invert_pyramid(num);
        // diamond(num);
        // hollow_square(num);
        hollow_right_triangle(num);
        sc.close();
    }
}
