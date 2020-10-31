package learn;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = "" 
 * 返回 " "
 *
 *
 *
 * @author su*/
public class FirstUniqChar50 {
    /**
     * hash表存储
     *
     * */
    public static char firstUniqChar(String s) {
        if(s == null || s.length() <= 0){
            return ' ';
        }
        char[] chars = s.toCharArray();
        char[] c = new char[256];
        for (int i = 0; i < s.length(); i++) {
           c[chars[i]]++;
        }
        for (int i = 0; i < c.length; i++) {
           if(c[s.charAt(i)] == 1){
               return s.charAt(i);
           }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "aabbcccdde";
        System.out.println(firstUniqChar(s));
    }
}
