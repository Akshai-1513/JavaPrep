package Practice.Problems_150;

/*
34. Generate series and find Nth element

The program is to find the nth element from the series.
The series is generated based on the three inputs.
The 4th element after the 3rd is based on the diff of a and b.
The 5th element after the 4th is based on the diff of b and c.

Example:
    inputs : 3, 5, 9, 8.
    Output: 23.
    Explanation : The generated series is 3, 5, 9, 11, 15, 17, 21, 23.
 */

public class Qn_34_Generate_series {
    static int Nth_value_of_Series(int input1, int input2, int input3, int input4){
        int val = input3;
        int diff_1 = 0, diff_2 = 0;
        if(input1 < input2){
            diff_1 = Math.abs(input1 - input2);
            diff_2 = Math.abs(input2 - input3);
            for (int i = 4; i<= input4; i++){
                if( i % 2 == 0) val = val + diff_1;
                else val = val + diff_2;
            }
        }
        else{
            diff_1 = Math.abs(input2 - input1);
            diff_2 = Math.abs(input3 - input2);
            for (int i = 4; i<= input4; i++){
                if( i % 2 == 0) val = val - diff_1;
                else val = val - diff_2;
            }
        }
        return val;
    }
}
