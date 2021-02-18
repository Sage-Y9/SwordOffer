import java.util.Stack;

/**
 * 题目7：用两个栈实现一个队列，实现appendTail和deleteTail函数，分别完成在队列尾部插入结点和队列头部删除结点功能
 */

public class Solution07 {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    //stack1入栈
    public static void appendTail(Integer num) {
        stack1.push(num);
    }

    //stack2出栈
    public static Integer deleteTail() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("队列为空！");
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }
}
