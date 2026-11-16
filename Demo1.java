
public class Demo1 {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;
       methodA(n, m);
    }
    public static void methodA(int a, int b){
       try {
         methodB(a,b);
       } catch (ArithmeticException e) {
        e.printStackTrace();

        e.getMessage();
            System.out.println("Error Found");
       }
    }
    public static void methodB(int x, int y){
        System.out.println(x / y);
        System.out.println("Hello");
    }
}