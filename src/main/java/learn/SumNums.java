package learn;

/**
 * 剑指 Offer 64
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: n = 3
 * 输出: 6
 *
 * */
public class SumNums {
    /**
     * 采用递归算法来处理
     * 别的不会
     *
     * */
    public static  int sumNums(int n) {
        return n == 0 ? 0 : n + sumNums(n - 1);
    }


    /**
     * 数学算法，
     *
     * */
    public static  int sumNums3(int n) {
        return n > 1 ? (1 + n) * n / 2 : n;
    }


    /**
     * 这是官方的解法
     * 很机智的用一个boolean来作为程序的出口。牛皮！
     *
     * */
    public static int sumNums2(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(5));
        System.out.println(sumNums2(5));
        System.out.println(sumNums3(5));
    }
}
