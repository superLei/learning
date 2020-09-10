package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
//        int i = 0;
        int j = 1;
        int len = s.length();
        int currentCount = -1;
        int res = 0;
        for (int i = 0; i < len; i++) {
            while (j < len){
                // 如果相同，则更新子字符串长度
                if(s.charAt(i) == s.charAt(j)){
                    currentCount = Math.max(currentCount, j - i);
                }
                j++;
            }
            res = Math.max(currentCount, res);
            j = i +1;

        }
        return res;
    }

    public static int lengthOfLongestSubstring2(String s){
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = j - 1;
            while(i >= 0 && s.charAt(i) != s.charAt(j)) i--; // 线性查找 i
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }

    /**
     * 双指针+hash表
     * */
    public static int lengthOfLongestSubstring3(String s){
        int res = 0;
        // 左指针,用-1做为初始值是为了，i-j可以做加法。相当于无重复的就一直+1.
        int j = -1;
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                // 更新左指针
                j = Math.max(map.get(s.charAt(i)) ,j);
            }
            // hash表记录
            map.put(s.charAt(i),i);
            res = Math.max(i -j,res);

        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
