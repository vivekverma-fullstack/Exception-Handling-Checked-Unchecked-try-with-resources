public class ExceptionPropagation {
    static void method3(){
        int ans = 10 / 0;   //ArithmeticException
    }
    static void method2(){
        method3();
    }
    static void method1(){
        method2();
    }
    public static void main(String[] args) {
        
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main()");
        }
        System.out.println("Rest of the Code: ");

    }
}
