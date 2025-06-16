package Practice.Problems_150;


/*
35. Find result after alternate add_sub on N:
Example:
    input1 = 6
    If the input2 is 1,then the result will be based on the
        result = 6 - 5 + 4 - 3 + 2 - 1
    If the input2 is 2, then the result is based on the
        result = 6 + 5 - 4 + 3 - 2 + 1

 */


public class Qn_35_alternate_sum {
    public int alternate_sum(int input1, int input2){
        int result = input1;
        switch(input2){
            case 1:
                while(input1 > 0){
                    if(input1 % 2 == 0){
                        input1 -= 1;
                        result -= input1;
                    }
                    else{
                        input1 -= 1;
                        result += input1;
                    }
                }
                break;

            case 2:
                while(input1 > 1){
                    if(input1 % 2 == 0){
                        input1 -= 1;
                        result += input1;
                    }
                    else{
                        input1 -= 1;
                        result -= input1;
                    }
                }
                break;
        }
        return result;
    }
}
