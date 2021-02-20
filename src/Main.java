
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
        if (Solution03.findNumber(arr, 10))
            System.out.println("this number is in this array");
        else
            System.out.println("can't find this number!");

        //题目4
        StringBuffer sb = new StringBuffer("We are happy.");
        System.out.println(Solution04.replaceSpace(sb));

        //题目5
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        Solution05.printListReverselyByStack(listNode1);
        Solution05.printListReverselyByRecursive(listNode1);

        Solution07.appendTail(1);
        Solution07.appendTail(2);
        Solution07.appendTail(3);
        System.out.println(Solution07.deleteTail());
        System.out.println(Solution07.deleteTail());

//        int[] nums = null;
//        int[] nums = {};
//        int[] nums = {1};
//        int[] nums = {1, 2, 3, 4, 5, 6};
//        int[] nums = {3, 4, 5, 1, 2};
        int[] nums = {1, 1, 0, 0, 1, 1, 1};
        System.out.println(Solution08.min(nums));

        System.out.println(Solution09.recursionCountJumpMethods(100));
        System.out.println(Solution09.recurrenceCountJumpMethods(100));

    }


}

