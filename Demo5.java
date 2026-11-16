public class Demo5 {
    public static void main(String[] args) {
        try{
            CheckAge(-78);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            System.out.println("Enter age is: "+e.getAge());
        }
    }
    public static  void CheckAge(int age) throws InvalidAgeException{
        if (age <= 0) {
            throw new InvalidAgeException("Invaild Age", age);
        }
    }
}
class InvalidAgeException extends Exception{
    private int age;
    public InvalidAgeException(String msg, int age){
        super(msg);

        this.age = age;
    }
    public int getAge(){
        return  this.age;
    }
}