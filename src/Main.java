
public class Main {

    /**
     * 测试主函数
     */

    public static void main(String[] args) {

        //题目2
        Solution02 s1 = Solution02.getInstance();
        Solution02 s2 = Solution02.getInstance();
        if (s1 == s2)
            System.out.println("same");
        else
            System.out.println("different");

        //题目3
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        Solution03 solution03 = new Solution03();
        if (solution03.findNumber(arr, 10))
            System.out.println("this number is in this array");
        else
            System.out.println("can't find this number!");

        //题目4
        StringBuffer sb = new StringBuffer("We are happy.");
        Solution04 solution04 = new Solution04();
        System.out.println(solution04.replaceSpace(sb));

        //题目5
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        Solution05 solution05 = new Solution05();
        solution05.printListReverselyByStack(listNode1);
        solution05.printListReverselyByRecursive(listNode1);

    }


}

