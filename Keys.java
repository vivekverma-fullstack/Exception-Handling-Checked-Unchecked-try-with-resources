public class Keys {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; 
        
        System.out.println("Program started...");

        try {
            System.out.println("Attempting division...");
            int result = numerator / denominator; 
            
            System.out.println("The result is: " + result); 
            
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide a number by zero!");
            
        } finally {
            System.out.println("Cleanup: Closing any open resources...");
        }

        System.out.println("Program continues normally...");
    }
}