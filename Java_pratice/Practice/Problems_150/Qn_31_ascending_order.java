package Practice.Problems_150;


/*
31. Problem to check whether all the numbers are arranged in ascending order
             Input-1 = 4567
             Output: Yes
             Input-2 = 4576
            Output: No
 */
public class Qn_31_ascending_order {
    static boolean num_ascending_order(int num){
        boolean flag = false;
        int min = Integer.MAX_VALUE, val;
        while(num > 0){
            val = num % 10;
            if(val < min){
                min = val;
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            num /= 10;
        }
        return flag;
    }

    public static void main(String[] args) {
        int a = 4576;
        if(num_ascending_order(a)) System.out.println("Yes");
        else System.out.println("No");
    }
}
