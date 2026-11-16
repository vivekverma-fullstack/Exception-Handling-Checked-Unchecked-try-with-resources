public class Demo2 {
    public static void main(String[] args) {
        try {
            try {
                String s = null;
                System.out.println(s.length());
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println("Inner catch");
            }
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Null value not allowed");
            e.getMessage();
                e.printStackTrace();
        }
    }
}
