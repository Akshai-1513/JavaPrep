import java.util.Scanner;

public class PNR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principla amount : ");
        int P = sc.nextInt();
        System.out.print("Enter the number of years : ");

        int N = sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        int R = sc.nextInt();

        int PNR = (P * N * R) / 100;
        System.out.println("The Simpple Interest is : " + PNR);

        sc.close();
    }

}
