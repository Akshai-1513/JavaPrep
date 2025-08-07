package Practice.OOPs.Polymorphism.Overriding;

public class Square extends Shapes{
    @Override // It's just an anotations it tells me that im overriding or not.

//    void printa(){
//        System.out.println("This the method about printing the shape square.");
//    }   It will show error if I didn't give the name same as the parent class method.

    void print(){
        System.out.println("square.");
    }
}
