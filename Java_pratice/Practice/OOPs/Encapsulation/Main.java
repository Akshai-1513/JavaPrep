package Practice.OOPs.Encapsulation;

class Encapsulate{
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Main {
    public static void main(String[] args) {
        Encapsulate object = new Encapsulate();
        object.setName("Yo bro");
        object.setNum(30);
        System.out.println("The age of a person is \"" + object.getNum() + "\" and his name is \"" + object.getName() +"\"");
    }
}