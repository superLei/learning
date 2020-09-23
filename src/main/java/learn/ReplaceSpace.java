package learn;

/**
 * @author sulei
 * @date 2020/9/11 10:05 上午
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
               int index = i + j*2;
               str.replace(index,index +1,"20%");
               j++;
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        StringBuffer ss = new StringBuffer("ss aa");
        ss.replace(0,5,"20%");
        System.out.println(ss.toString());
//        System.out.println(replaceSpace(ss));
    }

}
