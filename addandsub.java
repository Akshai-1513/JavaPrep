import java.util.Random;

public class addandsub {
    public static void main(String[] args) {
        Random rad = new Random();
        int num1 = rad.nextInt(100);
        System.out.println("The First integer is " + num1);
        int num2 = rad.nextInt(100);
        System.out.println("The second integer is " + num2);
        int num3;

        System.out.println("The addition of the two number is " + (num1 + num2));

        num3 = num1 - num2;
        if (num3 < 0) {
            num3 = num3 * -1; // If the substracted value is negative ,it will change it to positive
        }
        System.out.println("The substraction of the two number is " + num3);
    }

}
