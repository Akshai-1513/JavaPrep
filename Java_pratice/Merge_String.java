import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
        
        String word1 = "asdfg";
        String word2 = "asd";
        
        int length = length(word1,word2);
        char[] word1_array = to_char_array(word1 , length);
        char[] word2_array = to_char_array(word2 , length);
        
        System.out.println(Arrays.toString(word1_array));
        System.out.println(Arrays.toString(word2_array));
        
        String merged = "";
        for(int i = 0;i<length;i++){
            if(word1_array[i] != ' ') 
                merged += word1_array[i];
            if(word2_array[i] != ' ') 
                merged += word2_array[i];
            
        }
        
        System.out.println(merged);
    }
    static int length(String a, String b){
        int length = (a.length() > b.length())? a.length() : b.length();
        return length;
    }

    static char[] to_char_array(String a, int length){
        char[] array = new char[length];
        for(int i = 0;i < length;i++){
            if(i < a.length())
                array[i] = a.charAt(i);
            else    
                array[i] = ' ';
        }
        return array;
    }
}