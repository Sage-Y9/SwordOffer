
/**
 * 题目4  替换空格
 *
 * 请事先一个函数，把字符串中的每个空格替换成“20%”。
 * 例如输入“We are happy.”，则输出“We%20are%20happy.”。
 *
 * 解法1：
 * 从前往后扫描，遇到空格时做替换，并把后面的字符后移，
 * 这样的话，后面的字符需要多次移动，时间复杂度为O(n的平方)。
 * 不采取这种解法。
 *
 * 解法2：
 * 从后往前，先扫描字符串中有多少个空格，计算出替换后字符串的长度，
 * 这样每个字符只需移动一次，时间复杂度为O(n).
 *
 */

public class Solution04 {
    public StringBuffer replaceSpace(StringBuffer sb) {
        int spaceNum = 0;
        //计算空格的数量
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ')
                spaceNum++;
        }
        //替换前字符串最后一个字符的索引
        int oldIndex = sb.length() - 1;
        //新的字符串长度
        int newLength = sb.length() + spaceNum * 2;
        sb.setLength(newLength);
        //替换后字符串最后一个字符的索引
        int newIndex = newLength - 1;

        //从后往前遍历原字符串
        for (; oldIndex >= 0; oldIndex--) {

            //如果遇到空格，则替换
            if (sb.charAt(oldIndex) == ' ') {
                sb.setCharAt(newIndex--, '0');
                sb.setCharAt(newIndex--, '2');
                sb.setCharAt(newIndex--, '%');
            }
            //不是空格的话则把该字符移动到相应的位置
            else
                sb.setCharAt(newIndex--, sb.charAt(oldIndex));
        }
        return sb;
    }
}
