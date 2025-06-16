package Practice.Problems_150;


/*
4. A number is said to be a magic number, if the sum of its digits are calculated till a
single digit recursively by adding the sum of the digits after every addition. If the
single digit comes out to be 1,then the number is a magic number.
for example-
    Number= 50113
    => 5+0+1+1+3=10
    => 1+0=1
    This is a Magic Number
 */


import java.util.Scanner;

public class Qn_24_Magic_number {
    public boolean magicnumber(int num){
        int sum = 0;
        while(num > 0){
            sum += (num % 10);
            num /= 10;
            if(num == 0 && sum >= 10){
                num = sum;
                sum = 0;
            }
        }
        return sum == 1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        Qn_24_Magic_number magic = new Qn_24_Magic_number();
        if(magic.magicnumber(num)) System.out.println("This is magic number");
        else System.out.println("This is not a magic number.");
    }
}
