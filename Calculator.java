import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int choice;

        while(true){
            System.out.println();
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Exit");
            System.out.print("Enter the choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("The addition of the two number is " + (num1 +num2));
                    break;

                case 2:
                    System.out.println("The Substraction of the two number is " + (num1-num2));
                    break;

                case 3 :
                    System.out.println("The Multiplication of the two number is " + (num1*num2));
                    break;

                case 4 :
                    if(num2 == 0)
                        System.out.println("The denominator value should not be equal to 0");
                    else {
                        System.out.printf("The division of the two number is  %.2f\n", (double)num1/num2);
                    }
                    break;

                case 5 :
                    System.out.println("The first number power second number is  " + (int)Math.pow(num1,num2));
                    break;
                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Enter the correct choice");
            }
        }
    }
}
