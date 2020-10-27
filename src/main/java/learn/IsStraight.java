package learn;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * <p>
 * 示例1:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: True
 * <p>
 * <p>
 * 示例2:
 * <p>
 * 输入: [0,0,1,2,5]
 * 输出: True
 * @author su
 */
public class IsStraight {

    /**
     * 条件：
     * 1. 除大小王，所有牌不能重复；
     * 2. 如果5张牌最大牌为Max,最小为Min(大小王除外)，则需要满足:
     *  Max - Min < 5
     *
     *
     * */
    public static boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0,min = 14;
        for(int n : nums){
            if(n == 0) continue; // 跳过大小王
            max = Math.max(max,n); // 最大牌
            min = Math.min(min,n); // 最小牌
            if(set.contains(n)) return false; // 重复牌
            set.add(n); // 添加牌到set中
        }
        return max -min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }
}
