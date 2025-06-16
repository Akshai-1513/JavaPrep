package Practice.Problems_150;


/*
32. Stepping Number or Not
  Neighbor number difference can be either -1 or 1
           Input-1 = 12345
           Output: Yes
           Input-2 = 1245
           Output: No
 */


public class Qn_32_stepping_no {
    static boolean stepping_number(int num){
        boolean flag = false;
        int diff;
        while (num > 10){
            diff = (num % 10) - (num % 100) /10 ;

            if(diff == 1 || diff == -1) flag = true;
            else {
                flag = false;
                break;
            }
            num /= 10;
        }

        return flag;
    }

    public static void main(String[] args) {
        int num = 12345;
        int num2 = 12356;
        if(stepping_number(num2)) System.out.println("Yes");
        else System.out.println("No");
    }
}
