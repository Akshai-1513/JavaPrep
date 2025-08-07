package Practice.OOPs.Inheritance;

public class Child1 extends Box {
    int weight = 200;
    Child1(){
        this.weight = weight;
    }
    Child1(int b,int l, int h, int weight){
        super(b,l,h); // It calls the parent class constructor
        this.weight = weight;
    }
}
