package Practice.OOPs.Constructors;

public class Var_final {
    public final double a;
    public final double b;

    Var_final(double a, int b){
        this.a = a;
        this.b = b;
    }
    Var_final(int a ,  double b){
        this.a = a;
        this.b = b;
    }
}
class Demo{
    public static void main(String[] args) {
        Var_final var = new Var_final(10.0, 20);

        System.out.println(var.a + var.b);

        Var_final var1 = new Var_final(20, 10.6);
        System.out.println(var1.a + var1.b);

    }
}
