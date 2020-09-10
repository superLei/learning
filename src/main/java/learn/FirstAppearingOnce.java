package learn;

import java.util.ArrayList;
import java.util.List;

public class FirstAppearingOnce {


    public static char firstAppearingOnce(String s) {
        char[] chars = s.toCharArray();
        List<Integer> existNums = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(existNums.contains(i)) continue;
            int next = i + 1;
            while (next < chars.length) {
                if (chars[i] != chars[next]) {
                    if (next++ == chars.length - 1) {
                        return chars[i];
                    }
                }else {
                    existNums.add(next);
                    break;
                }
            }

        }
        return '#';
    }

    private static int firstAppearingOnce(char s) {
        return 1;
    }
    public static void main(String[] args) {
        String s = "go";
        System.out.println(firstAppearingOnce(s));
    }
}
