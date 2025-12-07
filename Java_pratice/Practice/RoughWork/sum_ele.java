package Practice.RoughWork;

import java.util.*;

public class sum_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        for(int i = 0; i< n; i++){
            int sum = 0;
            int num = nums[i];
            while(num > 0){
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            nums[i] = sum;
        }
        System.out.println(Arrays.toString(nums));
    }
}
