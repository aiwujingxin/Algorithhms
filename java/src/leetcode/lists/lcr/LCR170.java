package leetcode.lists.lcr;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/9/14 01:34
 */
public class LCR170 {

    public int[] mergeSort(int[] nums) {
        this.nums = nums;
        this.temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    int res = 0;
    int[] nums;
    int[] temp;

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        this.nums = nums;
        this.temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return res;
    }

    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, mid, start, end);
    }

    public void merge(int[] nums, int mid, int start, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i < mid + 1 && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else if (nums[i] > nums[j]) {
                temp[k] = nums[j];
                j++;
                // 统计
                res += mid - i + 1;
            }
            k++;
        }
        while (i < mid + 1) {
            temp[k] = nums[i];
            k++;
            i++;
        }
        while (j <= end) {
            temp[k] = nums[j];
            k++;
            j++;
        }
        for (int l = start; l <= end; l++) {
            nums[l] = temp[l];
        }
    }
}
