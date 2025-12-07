package Practice.RoughWork;

public class duplicate_ele {
    public static void main(String[] args) {
        int num[] = {12, 47, 12, 32, 84, 47};
        int res[] = new int[num.length];
        res[0] = num[0];
        int index = 1;
        for (int i = 1; i < num.length; i++){
            boolean isdub = false;
            for (int j = 0; j < index; j++){
                if(num[i] == res[j]) {
                    isdub = true;
                    break;
                }
            }
            if(!isdub){
                res[index] = num[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) System.out.print(res[i] + " ");
    }
}
