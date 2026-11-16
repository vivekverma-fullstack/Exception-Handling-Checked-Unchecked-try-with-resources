import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo4 {
    public static void main(String[] args) {
        try {
            Readfile();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    public static  void Readfile() throws FileNotFoundException{
        FileReader f = new FileReader("MyFirstFile.txt");
    }
}
