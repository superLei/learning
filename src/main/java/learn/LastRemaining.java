package learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 * <p>
 * 示例 1：
 * <p>
 * 输入: n = 5, m = 3
 * 输出: 3
 * 示例 2：
 * <p>
 * 输入: n = 10, m = 17
 * 输出: 2
 */
public class LastRemaining {
    /**
     * 这道题目，给人的第一感觉就是使用链表，因为是属于环状的问题。
     * 关键点是找到下一个要删除的位置，假设当前位置是idx,则要删除的位置为（idx + m），则下一个要删除的位置为（idx + m -1）,由于数到
     * 末尾会从头继续数，根据要对删除的位置取模(idx + m - 1) % n
     * 找到要删除的位置就简单了
     */
    public static int lastRemaining(int n, int m) {

        if (n <= 0 || m <= 0) return -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

    /**
     *  抄写数学答案。
     *
     * */
    public static int lastRemaining2(int n, int m) {

        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lastRemaining(5, 3));
    }
}
