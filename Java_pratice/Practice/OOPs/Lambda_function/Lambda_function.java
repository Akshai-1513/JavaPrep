package Practice.OOPs.Lambda_function;

public class Lambda_function {
    public static void main(String[] args) {

        Operation sum = (a ,b) -> a + b;
        Operation sub = (a, b) -> a - b;

        Lambda_function op = new Lambda_function();
        System.out.println(op.Operate(10, 20 ,sum));
        System.out.println(op.Operate(20, 13, sub));

    }

    // Here the function is created to access the operation for the process
    int Operate(int a, int b, Operation op){
        return op.operand(a, b);
    }
}


interface Operation{
    int operand(int a , int b);
}