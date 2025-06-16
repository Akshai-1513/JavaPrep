package Practice.Problems_150;


/*
51.
    No-5
    E D C B A
    A B C D
    D C B
    B A
    A
 */
public class Qn_51 {
    public static void alpha_pattern(int num){
        for (int i = 1; i <= num; i++){
            int len =num + 1 - i;
            for(int j = 0; j <   len; j++){
                if(i % 2 == 1){
                    System.out.print((char) ('A' + num - 1 - j));
                }
                else System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

//    public static void alpha_pattern(int num){
//        for (int i = 1; i <= num; i++){
//            for(int j = 1; j <= i; j++){
//                if(i % 2 == 0){
//                    System.out.print((char) ('A' - 1 + j));
//                }
//                else System.out.print((char) ('A' - j + num));
//            }
//            System.out.println();
//        }
//    }
    /*
    Output:
        E
        AB
        EDC
        ABCD
        EDCBA
     */
    public static void main(String[] args) {
        int num = 5;
        alpha_pattern(num);
    }
}
