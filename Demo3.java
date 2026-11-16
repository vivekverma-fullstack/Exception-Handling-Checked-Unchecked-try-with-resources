public class Demo3 {
    public static void main(String[] args) {
        try {
            check(-12);
        } catch (IllegalAccessError e) {
            e.printStackTrace();
        }
    }

    public static void check(int age) {
        if (age <= 0) {
            throw new IllegalAccessError("Invaild Age");
        }
        if (age > 17) {
            System.out.println("Okkk");
        } else {
            System.out.println("bhg bsdk");
        }
    }

}
