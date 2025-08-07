package Practice.OOPs.Static;

public class Static_block {
    static int a = 10;
    static  int b;

    static {
        b = a * 10;
    }

    public static int add(int a, int b){
        int c = 10;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(a,b));
    }
}
