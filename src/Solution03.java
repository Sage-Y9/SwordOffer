public class Solution03 {
    /**
     * 题目3：二维数组中的查找
     *
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排列。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有这个整数。
     */

    public boolean findNumber(int[][] arr, int num) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row <= arr.length - 1 && col >= 0) {
            if (num == arr[row][col])
                return true;
            else if (num > arr[row][col])
                row++;
            else
                col--;
        }
        return false;
    }
}
