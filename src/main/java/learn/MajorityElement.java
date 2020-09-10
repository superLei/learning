package learn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 *
 * */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int tmp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == tmp){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                tmp = nums[i];
                count = 1;
            }

        }
        int t = nums.length/2 +1;
        count = 0;
        for(int x :nums) {
            if(x == tmp) count++;
            if(count == t) return tmp;
        }
        return -1;
    }

    public static int majorityElement3(int[] nums){
        int res = nums[0];
        int flag =0;
        for(int i : nums){
            if(flag == 0){
                res = nums[i];
            }
            flag += i == res ? 1: -1;
        }
        return res;
    }

    public static int majorityElement2(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(nums[i])) {
               Integer integer = map.get(nums[i]);
               map.put(nums[i],integer+1);

           }else {
               map.put(nums[i],1);
            }
        }
        for(Integer x: map.keySet()){
            if(map.get(x) > (nums.length / 2)){
               return x;
            }
        }
        return -1;
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = -1, res = 0;
        for (int j = 0; j < s.length(); j++) {
           if(map.containsKey(s.charAt(j))){
               i = Math.max(i,map.get(s.charAt(j)));
           }
           map.put(s.charAt(j),j);
           res = Math.max(res,j -i);
        }
        return res;

    }

    public static void main(String[] args) {
       int[] t = {3,5,5,5,5};
        System.out.println(majorityElement(t));
        StringBuffer b = new StringBuffer();
    }
}
