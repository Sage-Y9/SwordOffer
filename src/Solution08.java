/**
 * 题目8：旋转数字的最小值
 */

public class Solution08 {
    public static int min(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //二分法查找
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        //大多数情况下，left指向的数比right指向的大（顺序数组除外，此时，mid为第一个数字）
        while (nums[left] >= nums[right]) {
            //left相邻或者指向同一个数字时，退出循环，mid为right
            if (right - left <= 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            //像{1, 0, 1, 1, 1}这种较为特殊的，三个指针指向的数字都相等，需要特殊处理
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                //当left下一个和right的前一个不相等时，比较他们的大小，重新给mid赋值
                if (nums[left + 1] != nums[right - 1]) {
                    mid = nums[left + 1] < nums[right - 1] ? left++ : right++;
                } else {
                    //还是相等的话，左右指针分别向后向前移动一步，下一轮继续比较
                    left++;
                    right--;
                }
            } else {
                //常规的二分查找
                if (nums[left] <= nums[mid]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
        }
        return nums[mid];
    }
}
