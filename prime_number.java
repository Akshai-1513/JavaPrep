public class prime_number {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }
}