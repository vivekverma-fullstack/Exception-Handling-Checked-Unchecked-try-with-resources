public class Demo1 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }
        //  catch (ArithmeticException e) {
        //     System.out.println(e);
        // } catch(Exception e){
        //     System.out.println(e);
        // }
        //catch(NullPointerException e){
        //     System.out.println(e);
        // }

        // After Java 7 --->

    catch(ArithmeticException | NumberFormatException | NullPointerException e /*| Exception e*/){
            System.out.println("Invalid logic: ");
        }
        System.out.println("rest of the Code");

    }
}
