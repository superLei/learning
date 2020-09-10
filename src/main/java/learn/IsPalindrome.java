package learn;

public class IsPalindrome {
    public static boolean  isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
           char c = s.charAt(i);
           if(Character.isLetterOrDigit(c)){
                stringBuffer.append(Character.toLowerCase(c));
           }
        }
        StringBuffer s2 = new StringBuffer(stringBuffer).reverse();
        return stringBuffer.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        String s = " man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
