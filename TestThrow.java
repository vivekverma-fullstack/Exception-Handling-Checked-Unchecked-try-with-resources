public class TestThrow {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for vote");
        } else {
            System.out.println("eligible for voting");
        }
    }
    public static void main(String[] args) {
       try {
         validate(10);
       } catch (ArithmeticException e) {
        System.out.println(e);
       }
        System.out.println("rest of code.....");
    }
}
