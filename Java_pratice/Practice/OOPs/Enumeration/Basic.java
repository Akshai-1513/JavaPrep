package Practice.OOPs.Enumeration;

public class Basic {


    public static void main(String[] args) {
        Week day;
        day = Week.Friday;
        System.out.println(day);
        System.out.println(day.ordinal());// Gives the position of the constant.

        day = Week.Thrusday;
        System.out.println(day);
    }
}
