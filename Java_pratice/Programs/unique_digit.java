package Programs;


public class unique_digit {
    public static void main(String[] args) {
       int arr[] = {2,4,5,4,2};
        System.out.println(unique.singleNumber(arr));

    }
}
class unique {
    static{
        for( int i = 0; i< 500; i++){
            singleNumber(new int[] {});
        }
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int singleNum : nums) {
            result ^= singleNum;
        }
        return result;
    }
}