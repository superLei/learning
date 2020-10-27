package learn;

/**
 * 剑指 Offer 65. 不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 * <p>
 * 示例:
 * <p>
 * 输入: a = 1, b = 1
 * 输出: 2
 *  
 * 提示：
 * <p>
 * a, b 均可能是负数或 0
 * 结果不会溢出 32 位整数
 * @author su
 */
public class Add {
    /**
     * 这个题是真不会呀，抄的答案，死记住吧。
     */
    public static int add(int a, int b) {
        //因为不允许用+号，所以求出异或部分和进位部分依然不能用+ 号，所以只能循环到没有进位为止
        while (b != 0) {
            //保存进位值，下次循环用
            int c = (a & b) << 1;
            ////保存不进位值，下次循环用，
            a ^= b;
            //如果还有进位，再循环，如果没有，则直接输出没有进位部分即可。
            b = c;
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(add(1, 3));
    }
}
