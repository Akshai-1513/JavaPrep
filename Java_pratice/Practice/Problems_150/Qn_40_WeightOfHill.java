package Practice.Problems_150;


/*
   40. Weight of a hill pattern:
   *
   **
   ***
   ****
Example 1:
    input:
        input1 = 2 (used for iteration)
        input2 = 10 (initial value)
        input3 = 3 (increment the value for each iteration)

    Output:
        result = 10 + (13 + 13)
        36

Example 2:
    Input:
        input1 = 4
        input2 = 5
        input3 = 2
    Output:
        result : 5 + (7 + 7) + (9 + 9 + 9) + (11 + 11 + 11)
 */
public class Qn_40_WeightOfHill {
    public static int sum_of_the_hill(int input1, int input2, int input3){
        int sum = input2, res = 0;
        for(int i = 2; i <= input1; i++){
            sum += input3;
            int result = 0;
            for(int j = 1; j <= i; j++){
                result += sum;
            }
            res += result;
        }
        return res + input2;
    }
}