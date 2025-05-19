public class Prefix_String {
    public static void main(String[] args) {
        String str1 = "Flow";
        String str2 = "Flower";
        int len_str1 = str1.length();
        int len_str2 = str2.length();
        int length = (len_str1 > len_str2)? len_str2 : len_str1;

        String prefix = "";

        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == (str2.charAt(i)))
                prefix += str1.charAt(i);
            else
                break;
        }
        System.out.println(prefix);
    }
}
