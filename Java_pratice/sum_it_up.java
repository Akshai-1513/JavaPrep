import java.util.Scanner;

public class sum_it_up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            sum += (num % 10);
            num /= 10;
            if(num == 0 && sum > 9){
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
