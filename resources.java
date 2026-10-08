import java.io.FileReader;

public class resources {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt")){
                System.out.println("File opened Successfully");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
