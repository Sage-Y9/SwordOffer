/**
 * 题目2
 * 设计一个类，我们只能生成该类的一个实例
 */

public class Solution02 {
    private static Solution02 instance;

    private Solution02() {

    }

    public static Solution02 getInstance() {
        if(instance == null)
            instance = new Solution02();
        return instance;
    }
}
