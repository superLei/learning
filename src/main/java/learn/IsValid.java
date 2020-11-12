package learn;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 *
 *
 * @author su*/
public class IsValid {
    /**
     * 垃圾，不对
     *
     * */
//    public static boolean isValid(String s) {
//        if (s == null || s.length() < 1) {
//            return true;
//        }
//        int len = s.length();
//        if (len % 2 != 0) {
//            return false;
//        } else {
//            for (int i = 0; i < len; i++) {
//               if(s.charAt(i) == '('){
//                    return s.charAt(i+1) == ')';
//               }else if(s.charAt(i) == '{'){
//                   return s.charAt(i+1) == '}';
//               }else if(s.charAt(i) == '['){
//                  return s.charAt(i+1) == ']';
//               }
//            }
//        }
//        return false;
//    }

    /**
     * 运用栈的数据结构，先进后出
     * 时间复杂度为O(n)，空间复杂度为O(n)
     *
     * */
    public static boolean isValid2(String s){
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            // 如果从map里面能匹配出右括号对应的左括号，则出栈
            if(map.containsKey(c)){
                // 判断栈是否为空（可能前面都成对出现了,当前的不匹配），以及当前字符是否和最后入栈的字符相等。
                if(stack.isEmpty() || !stack.peek().equals(map.get(c))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        // 栈为空，则证明全部匹配成功。
        return stack.isEmpty();
    }


    public static class A{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
//        List<A> list = new ArrayList<>();
//        list.add(null);
//        System.out.println(list.toString());
//        System.out.println(list.size());
//        System.out.println(list == null);
//        Collection<?> collection = list;
//        System.out.println(list.isEmpty());
        String test = "()()[]";
        System.out.println(isValid2(test));
    }
}
