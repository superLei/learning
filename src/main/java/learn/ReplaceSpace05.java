package learn;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * @author sulei
 * @date 2020/9/11 10:05 上午
 */
public class ReplaceSpace05 {

    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                int index = i + j * 2;
                str.replace(index, index + 1, "20%");
                j++;
            }
        }
        return str.toString();
    }

    public static String replaceSpace2(String s) {
        StringBuffer sb = new StringBuffer(s);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                int index = i + j * 2;
                sb.replace(index, index + 1, "%20");
                j++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        StringBuffer ss = new StringBuffer("ss aa");
        ss.replace(0, 5, "20%");
        System.out.println(ss.toString());
//        System.out.println(replaceSpace(ss));
    }

}
