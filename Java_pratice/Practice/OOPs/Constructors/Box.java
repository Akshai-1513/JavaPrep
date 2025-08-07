package Practice.OOPs.Constructors;

public class Box {
    int l = 50;
    int b = 25;
    int h = 50;
    int weight = 10;

    Box(){
        this.l = l;
        this.h  =h;
        this.b = b;
    }

    Box(int l , int b, int h){
        this.l = l;
        this.h  =h;
        this.b = b;
    }
    Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.b = other.b;
    }

    public Box(int l, int b, int h, int weight) {
        this.l = l;
        this.b = b;
        this.h = h;
        this.weight = weight;
    }
}

