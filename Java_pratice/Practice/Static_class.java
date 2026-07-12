package Practice;

public class Static_class {
    static class stat {
        static int a = 10;
        String b = "HEllo";
    }

    public static void main() {
        stat s= new stat();
        System.out.println(s.b);
    }
}
