package learn;

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

    public static boolean isStraight(int[] nums) {
        int zc = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zc++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(zc >= 4){
                return true;
            }else {
                if
            }
        }

    }
}
