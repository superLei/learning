package learn;

public class ReverseWords {

    public static String reverseWords(String s) {
        if (s.length() == 0) return "";
        String[] ss = s.split(" ");
        String res = "";
        for (int i = 0; i < ss.length; i++) {
            for (int j = ss[i].length() -1; j >= 0; j--) {
               res += String.valueOf(ss[i].charAt(j));
            }
            res += " ";
        }
        return res;

    }

    public static String reverseWords2(String s) {
        if(s.length() == 0) return "";
        StringBuffer res = new StringBuffer();
        int i = 0;
        while (i< s.length()) {
            int start = i;
            while(i < s.length() && s.charAt(i) != ' ' ) {
                i++;
            }
            for (int j = start; j < i; j++) {
                res.append(s.charAt(i + start - 1 -j));
            }
            while (i< s.length() && s.charAt(i) == ' '){
                i+=1;
                res.append(' ');
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords2(s));
    }
}
