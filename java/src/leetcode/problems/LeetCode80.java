package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/12/19 14:37
 * @see LeetCode26
 * @see LeetCode27
 */
public class LeetCode80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 2;
        int right = 2;
        while (right < nums.length) {
            if (nums[left - 2] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }

}
