package Programs;

public class prime_number {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 100) {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    break;
                }
                i++;
            }
            if (i == num) {
                System.out.println(num);
            }
            num++;
        }
    }
}