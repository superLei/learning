package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LengthOfLongestSubstring48 {
    public static int lengthOfLongestSubstring(String s) {
//        int i = 0;
        int j = 1;
        int len = s.length();
        int currentCount = -1;
        int res = 0;
        for (int i = 0; i < len; i++) {
            while (j < len) {
                // 如果相同，则更新子字符串长度
                if (s.charAt(i) == s.charAt(j)) {
                    currentCount = Math.max(currentCount, j - i);
                }
                j++;
            }
            res = Math.max(currentCount, res);
            j = i + 1;

        }
        return res;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int res = 0, tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            int i = j - 1;
            while (i >= 0 && s.charAt(i) != s.charAt(j)) i--; // 线性查找 i
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }

    /**
     * 双指针+hash表
     */
    public static int lengthOfLongestSubstring3(String s) {
        int res = 0;
        // 左指针,用-1做为初始值是为了，i-j可以做加法。相当于无重复的就一直+1.
        int j = -1;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                // 更新左指针
                j = Math.max(map.get(s.charAt(i)), j);
            }
            // hash表记录
            map.put(s.charAt(i), i);
            res = Math.max(i - j, res);

        }
        return res;
    }

    public static int lengthOfLongestSubstring4(String s) {
        if (s == null || s.length() <= 0) {
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        int tmp = 0;
        int res = 0;
        for (int j = 0; j < s.length(); j++) {
            // 获取当前字符的索引
           int i = map.getOrDefault(s.charAt(j),-1);
           // 更新hash表
           map.put(s.charAt(j),j);
           // 记录子字符串长度，判断字符在hash表的位置, 是应该加1，还是应该取没有重复的字符之前的距离
           tmp = tmp < j - i ? tmp+1 : j -i;
           // 一次循环，就知道了所有字符的位置，然后把每次的子串长度作对比，取最长的。
           res = Math.max(res,tmp);
        }
        return res;


    }

    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "abccccc";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring4(s));
    }
}
