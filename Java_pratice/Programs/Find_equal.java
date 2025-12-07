package Programs;

import java.util.Arrays;

public class Find_equal {
    public static void main(String[] args) {
        int[] arr = {3,4 ,34};
        String result = triangleType(arr);
        System.out.println(result);
    }

    static int equal(int a, int b) {
        if (a == b) return a;
        return -1;
    }
        public static String triangleType(int[] nums) {
            if(nums.length != 3)
                return "none";
            Arrays.sort(nums);
            int count = 0;
            if ((nums[0] + nums[1]) > nums[2]){
                for (int i = 0;i<3;i++){
                    for(int j = i+1;j<3;j++){
                        if(equal(nums[i],nums[j])!=-1)
                            count++;
                    }
                }
            }
            else
                return "none";
            if (count == 3)
                return "equilateral";
            else if(count==1 || count == 2)
                return "isosceles";
            else
                return "scalene";
        }
    }

