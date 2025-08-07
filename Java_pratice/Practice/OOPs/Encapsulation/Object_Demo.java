package Practice.OOPs.Encapsulation;

public class Object_Demo {
    int num;
    public Object_Demo(int num) {
        this.num = num;
    }

    //It represents the value in the form of string
    @Override
    public String toString() {
        return super.toString();
    }

    //It is used when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    //converts the value in the form of hashcode
    //Every single time it give new hascode
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Object_Demo object = new Object_Demo(30);
        System.out.println(object.hashCode());

        Object_Demo object2 = new Object_Demo(30);
        System.out.println(object2.hashCode());
    }
}
