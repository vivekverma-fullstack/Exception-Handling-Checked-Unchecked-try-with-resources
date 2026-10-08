import java.io.IOException;

public class Testthrows {
    static void readFile() throws IOException{
        throw new IOException("File not Found");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Exception catch: "+e);
        }
        System.out.println("Rest of Code");
    }
}
