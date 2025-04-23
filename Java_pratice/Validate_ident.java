import java.util.Scanner;

public class Validate_ident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc. next();
        sc.nextLine();
        boolean flag =true;

        if (!(str.charAt(0)=='_' || str.charAt(0)=='$' 
        ||(str.charAt(0)>=65 && str.charAt(0)<= 90) 
        ||(str.charAt(0)>= 97 &&str.charAt(0)<= 122 ))){
            flag =false;
        }

        else
            for(int i = 0; i < str.length();i++){
                if (!(str.charAt(i)=='_' || str.charAt(i)=='$' 
                ||(str.charAt(i)>=65 && str.charAt(i)<= 90) 
                ||(str.charAt(i)>= 97 &&str.charAt(i)<= 122 ))){
                   flag = false;
                    break;
                }
                else
                    continue;
        }
        if (flag == true)
            System.out.println("Valid ");
        else
            System.out.println("Invalid");
    }
}
