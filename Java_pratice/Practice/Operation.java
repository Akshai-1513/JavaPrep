package Practice;

public interface Operation {
    public int sum(int a, int b);
    int a = 10;

}

class Calc implements Operation{

    @Override
    public int sum(int a , int b){
        return a + b;
    }

}

class Main{
    static void main() {
        Operation op = new Calc(); // This methoed called after implementing in Calc.
        int sum1 = op.sum(10, 15);
        System.out.println(sum1);

        Operation op2 = (a, b) -> a + b; // The method without implementing Operation
        int sum2 = op2.sum(10, 2);
        System.out.println(sum2);
        System.out.println(op2.a);
    }
}