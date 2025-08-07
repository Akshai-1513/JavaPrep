package Practice.OOPs.Exception_Handling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
//            int c = a / b;
            System.out.println(divide(a,b));
        }
        // Throw exception at runtime.
        catch (Exception e){   // In catch the keyword for the exception should be either "e" or "exception"
            System.out.println(e.getMessage()); // this tell about the description about the exception.
            throw new ArithmeticException("Divided by zero");
        }
        finally { //It will always execute even it has exception.
            System.out.println("The will always execute.");
        }
    }

    // Explicit type of exception is done using throw, throws.
    static int divide(int a, int b) throws Exception{
        if (b == 0){
            throw new ArithmeticException("Divided by zero.");
        }
        return a / b;
    }
}
// If the divide function called, the exception inside the method is applied.
// If not the catch block is executed.