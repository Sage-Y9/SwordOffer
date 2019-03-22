
/**
 * 题目5
 *
 * 输入一个链表的头结点，
 * 从尾到头反过来打印出每个结点的值
 */

import java.util.Stack;

public class Solution05 {

    //利用栈的特性，先遍历链表，把结点的值入栈，再从栈顶开始输出
    public static void printListReverselyByStack (ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.data);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    //递归实现
    //每访问到一个结点时，先递归输出后面的结点，再输出该结点
    public static void printListReverselyByRecursive (ListNode listNode) {
        if (listNode != null) {
            if (listNode.next != null) {
                printListReverselyByRecursive(listNode.next);
            }
            System.out.print(listNode.data + " ");
        }
    }
}
