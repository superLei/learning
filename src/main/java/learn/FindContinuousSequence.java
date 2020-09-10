package learn;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 * */
public class FindContinuousSequence {

    public static int[][] findContinuousSequence(int target) {
            int i = 1;
            int j = 1;
            int sum = 0;
            List<int[]> res = new ArrayList<>();
            while (i <= target /2){
                if(sum < target){
                    // 右边界向右移动
                    sum+=j;
                    j++;
                } else if(sum > target){
                    // 左边界向右移动
                   sum-=i;
                   i++;
                }else {
                    // 添加结果到list中。
                    int[] tmp = new int[j -i];
                    int value = i;
                    for (int k = 0; k < tmp.length; k++) {
                        tmp[k] = value++;
                    }
                    res.add(tmp);
                    // 向右移动指针
                    sum -= i;
                    i++;
                }

            }
            return res.toArray(new int[res.size()][]);
    }

    public static int[][] findContinuousSequence2(int target) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int sum = 0; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += j;
                j++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            } else {
                // 记录结果
                int[] arr = new int[j-i];
                for (int k = i; k < j; k++) {
                    arr[k-i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }


    public static void main(String[] args) {
        int target = 15;
        int[][] ints = findContinuousSequence(target);
        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }
}
