import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i =1 ; i< num;i++){
            if (num % i == 0){
                System.out.print(i + " + ");
                sum =sum + i;
            }
        }
        System.out.println(" = " + sum);
        System.out.println((sum == num) ?true:false);

    }
}
