package learn.offer68;

import java.util.Arrays;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 */
public class PrintNumbers17 {

    public static int[] printNumbers(int n) {
        if (n <= 0) {
            return new int[0];
        }
        StringBuilder s = new StringBuilder();
        int end = 0;
        if (n <= 9) {
            for (int i = 0; i < n; i++) {
                s.append("9");
            }
            end = Integer.parseInt(s.toString());
        } else {
            end = Integer.MAX_VALUE;
        }
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            int j = i + 1;
            res[i] = j;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
