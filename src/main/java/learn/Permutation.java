package learn;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 *
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 * */
public class Permutation {
    public static Set<String> res = new HashSet();
    public static Set<String> permutation(String str) {
        if (str == null) return null;
        char[] ch = str.toCharArray();
        return permutation2(ch, 0);
    }

    public static void permutation(char[] ca, int begin) {
        if (begin == ca.length) {
            System.out.println(String.valueOf(ca));
        } else {
            for (int i = begin; i < ca.length; i++) {
                swap(ca, i, begin);
                permutation(ca, begin + 1);
                swap(ca, i, begin);
            }

        }
    }

    public static HashSet<String> permutation2(char[] ca, int begin){
       if(begin == ca.length){
           res.add(String.valueOf(ca));
       } else{
           for (int i = begin; i < ca.length; i++) {
              swap(ca,i,begin);
              permutation2(ca,begin+1);
              swap(ca,i,begin);
           }
       }
       return (HashSet<String>) res;
    }

    static void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

    public static void main(String[] args) {
        String s = "abbd";
        Set<String> permutation = permutation(s);
        for (String s1 : permutation) {
            System.out.println(s1);
        }

    }
}
