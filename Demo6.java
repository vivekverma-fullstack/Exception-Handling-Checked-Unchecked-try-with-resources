import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) {
        try(FileReader fb = new FileReader("abc.txt")){
            int data = fb.read();
            System.out.println((char)data);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
