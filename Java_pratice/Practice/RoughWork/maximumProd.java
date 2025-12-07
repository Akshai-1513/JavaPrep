package Practice.RoughWork;

import java.util.Scanner;

public class maximumProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i< n; i++){
            nums[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for(int i : nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = n;
            }

            if(i < min1){
                min2 = min1;
                min1 = i;
            } else if (i < min2) { min2 = i;

            }

            int prod_max = max1 * max2;
            int prod_min = min1 * min2;

            int sum = 0;
            if(prod_max >= prod_min) sum = max1 + max2;
            else sum = min2 + min1;
            System.out.println(sum);
        }
    }
}
