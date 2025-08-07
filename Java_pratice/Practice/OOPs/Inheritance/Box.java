package Practice.OOPs.Inheritance;

public class Box {
        int l = 50;
        int b = 25;
        int h = 50;
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
}
