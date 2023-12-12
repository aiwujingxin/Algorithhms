package basic.algorithm.sort;

import basic.datastructure.array.ArraySort;

import java.util.Random;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/9/14 22:47
 */
public class QuickSort implements ArraySort {
    @Override
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partition(nums, left, right);
        quickSort(nums, left, index - 1);
        quickSort(nums, index + 1, right);
    }

    private int partition(int[] nums, int i, int j) {
        int ri = new Random().nextInt(j - i + 1) + i; // 随机选一个作为我们的主元
        swap(nums, ri, i);

        int pi = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= pi) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= pi) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pi;
        return i;
    }

    private void swap(int[] nums, int ri, int i) {
        int temp = nums[i];
        nums[i] = nums[ri];
        nums[ri] = temp;
    }
}
