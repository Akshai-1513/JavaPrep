
public class Vowels_Consonants {
    public static void main(String[] args) {
        String str = "Hello21 Thiis *6% Su.,MMa";
        str = str.toLowerCase();

        int count_v = 0;
        int count_c = 0;
        int count_s = 0;
        int count_n = 0;

        for (int i = 0;i< str.length();i++){
            if (str.charAt(i)!= ' '){
                if(str.charAt(i) =='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                    count_v++ ;
            
                else if (str.charAt(i)>= 97 && str.charAt(i)<= 122)
                    count_c++ ;

                else if(str.charAt(i)>=48 && str.charAt(i)<= 57)
                    count_n++;

                else
                    count_s++;
            }
            else 
                continue;
        }
        System.out.println("Vowels : " + count_v);
        System.out.println("Consonants : " + count_c);
        System.out.println("Specials : " + count_s);
        System.out.println("Numbers : " + count_n);
    }
}
