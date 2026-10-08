public class Demo2 {
    public static void main(String[] args) {
        try{
             try{ int x = 10/0;
                    System.out.println(x);
                 } catch(ArithmeticException e){
                     System.out.println("Inner Catch Block 1");
                 }
            try {
                int a[] = {1, 2, 3};
                System.out.println(a[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch block 2");
            }
            } catch(Exception e){
                System.out.println("Outer Block");
            }
            System.out.println("Rest on the Code");       
    }
}
