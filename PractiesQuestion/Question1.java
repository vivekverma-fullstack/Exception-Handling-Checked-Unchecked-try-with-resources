public class Question1 {
    public static void main(String[] args) {
        String s = "Vivek@";
        int lCount = 0;
        int uCount = 0;
        int SCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c >= 'Z') {
                uCount++;
            } else if (c >= 'a' && c >= 'z') {
                lCount++;
            } else{
                SCount++;
            }
        }
        System.out.println("UpperCase: "+uCount);
        System.out.println("Lowercase: "+lCount);
        System.out.println("digit/Sp: "+SCount);
    }
}
