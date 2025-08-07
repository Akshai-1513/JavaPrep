package Practice.OOPs.Acces_control;

public class A {
    protected int num;
    String str;
    int[] arr;

    public A(int num, String str) {
        this.num = num;
        this.str = str;
        this.arr = new int[num];
    }
}
