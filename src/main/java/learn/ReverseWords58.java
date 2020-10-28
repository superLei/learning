package learn;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 * 示例 1：
 * <p>
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 * <p>
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 */
public class ReverseWords58 {

    /**
     *分割 + 倒序
     *
     * */
    public static String reverseWords(String s) {
        if (s.length() == 0) return "";
        // 删除首尾空格，分割字符串
        String[] ss = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int j = ss.length - 1; j >= 0; j--) {
            if(ss[j].equals("")) continue;
            res.append(ss[j]).append(" ");
        }
        return res.toString();

    }

    /**
     * 双指针
     */
    public static String reverseWords3(String s) {
        if (s == null || s.length() <= 0) {
            return "";
        }
        int n = s.length() - 1;
        StringBuffer res = new StringBuffer();
        while (n >= 0) {
            // 指向下个单词的末尾
            int end = n;
            while (n >= 0 && s.charAt(n) != ' ') {
                n--;
            }
            // n + 1 是因为n--了
            res.append(s.substring(n + 1, end + 1));
            while (n >= 0 && s.charAt(n) == ' ') {
                n--;
            }
            res.append(' ');
        }
        return res.toString();
    }

    public static String reverseWords2(String s) {
        if (s.length() == 0) return "";
        StringBuffer res = new StringBuffer();
        int i = 0;
        while (i < s.length()) {
            int start = i;
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            for (int j = start; j < i; j++) {
                res.append(s.charAt(i + start - 1 - j));
            }
            while (i < s.length() && s.charAt(i) == ' ') {
                i += 1;
                res.append(' ');
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords3(s));
        System.out.println(reverseWords(s));
    }
}
