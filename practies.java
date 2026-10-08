import java.util.Scanner;

public class practies {
    static void print(int marks){
        if (marks < 0 || marks > 100) {
            throw new ArithmeticException("marks invalid: ");
        } else{
            System.out.println("OkOk");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
       try {
         print(marks);
       } catch (ArithmeticException e) {
        System.out.println(e);
       }
       System.out.println("Program Execute.....");
    }
}
