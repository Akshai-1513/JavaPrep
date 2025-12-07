package Practice.FileHandling;

import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException{

//         <---------InputStream----------->
        try(InputStreamReader is  = new InputStreamReader(System.in)) {
            int val = is.read(); // the read method actually take the by as the value not the character, so typecast the value to character.
            while (is.ready()){
                System.out.println((char) val);
                val = is.read();
            }
            is.close();
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

//        <-----------FileReader------------>
        try (FileReader fr = new FileReader("E:\\Akshai AK\\Codings\\Java\\Java_pratice\\Practice\\FileHandling\\Reference.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        <----------BufferedReader----------->
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Akshai AK\\Codings\\Java\\Java_pratice\\Practice\\FileHandling\\Reference.txt"))){
            String line  = "";
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
