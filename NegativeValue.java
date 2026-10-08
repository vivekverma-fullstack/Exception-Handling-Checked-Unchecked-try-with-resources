import java.util.Scanner;

public class NegativeValue {

    static void checkValue(int num) {
        if (num < 0) {
            throw new ArithmeticException("Negative value is not allowed");
        }

        System.out.println("Valid value: " + num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = sc.nextInt();

        try {
        checkValue(num);
       } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println(e);
       }
       System.out.println("Program Execute.....");
    }
    
}