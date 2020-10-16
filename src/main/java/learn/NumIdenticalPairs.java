package learn;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 好数对的数目
 */
public class NumIdenticalPairs {


    public static int numIdenticalPairs(int[] arr) {
//        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
//                  map.put(i,j);
                }
            }
        }
        return count;
    }

    public static Map<String, Integer> method(String[] strs) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strs.length; i++) {
            //
            String sort = sort(strs[i]);
            int count = 0;
            for (int j = i + 1; j < strs.length; j++) {
                if (sort.equals(sort(strs[j]))) {

                }

            }

        }

        return map;
    }

    public static String sort(String str) {
        String[] array_str = str.split("");//将字符串转成字符数组
        TreeSet<String> treeSet = new TreeSet<String>();
        for (String s : array_str) {//遍历字符数组
            treeSet.add(s);//将字符放入treeSet中，利用treeSet集合有序不重复的特性
        }
        String st = "";
        for (String s : treeSet) {//遍历treeSet集合，在拼接到str字符串中
            st += s;
        }
        return st;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int j = 0;
            for (int k = 0; k < nums.length; k++) {
                if (i != k && current > nums[k]) {
                    result[i] = ++j;
                }
            }

        }
        return result;
    }

    /**
     * 存在重复元素
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setNum = new HashSet<Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            setNum.add(nums[i]);
        }
        return setNum.size() < nums.length;
    }

    /**
     * 按奇偶排序数组 II
     */
    public static int[] sortArrayByParityII(int[] nums) {

        int s = 1;
        for (int i = 0; i < nums.length; i+=2) {
          if(nums[i] % 2 == 1) {
              while (nums[s] % 2 == 1) {
                  s +=2;
              }
              int tmp = nums[i];
              nums[i] = nums[s];
              nums[s] = tmp;
          }
        }
        return nums;
    }

    public static int[] sortArrayByParityII2(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) == 0) {
                result[j] = nums[i];
                j += 2;
            } else {
                result[k] = nums[i];
                k += 2;
            }
        }
        return result;
    }


    public static void main(String[] args) {
//        int[] arr = {1,2,3}; System.out.println(numIdenticalPairs(arr));
        String a = "abc";
        String b = "bcaaa";
        String[] sts = {"ab", "bc", "ba", "bcc", "bcc"};
//        Map<String, Integer> method = method(sts);
//        for(Map.Entry entry: method.entrySet()){
//            System.out.println(entry);
//        }
        int[] nums = {4,2,5,7};
        int[] ints = sortArrayByParityII(nums);

//        boolean b1 = containsDuplicate(nums);
//        System.out.println(b1);
//        int[] ints = smallerNumbersThanCurrent(nums);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
        int j = 1;
        System.out.println((++j)+(++j));
        System.out.println(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()));
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
    }
}
