package learn;

import com.google.common.base.Stopwatch;

import java.util.Arrays;

/**
 * 左旋转字符串
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * @author su
 */
public class ReverseLeftWords58 {

    public static String reverseLeftWords(String s, int n) {

        if (s == null || s.length() <= 0 || n < 0) {
            return "";
        }
        return s.substring(n, s.length()).concat(s.substring(0,n));
    }


    /**
     *  局部反转+整体反转
     *
     * */
    public static String reverseLeftWords2(String s, int n) {

        if (s == null || s.length() <= 0 || n < 0) {
            return "";
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        reverse(chars,0,n-1);
        reverse(chars,n,len -1);
        reverse(chars,0,len -1);
//        reverse(chars,0,len-1);
//        reverse(chars,0,len-1 -n );
//        reverse(chars,len -n ,len-1);
        return new String(chars);
    }

    public static void reverse(char[] s ,int i, int j){
        while(i < j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Stopwatch started = Stopwatch.createStarted();
        System.out.println(reverseLeftWords("abcdefg",2));
        started.stop();
        System.out.println(started.toString());
        started.reset();
        started.start();
        System.out.println(reverseLeftWords2("abcdefg",2));
        started.stop();
        System.out.println(started.toString());
    }
}
