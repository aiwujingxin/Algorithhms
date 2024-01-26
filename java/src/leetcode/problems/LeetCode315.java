package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wujingxinit@outlook.com
 * @date 2023.11.10 00:59
 */
public class LeetCode315 {

    private int[][] temp;
    private int[] ans;

    public List<Integer> countSmaller(int[] nums) {
        this.temp = new int[nums.length][];
        int[][] arrs = new int[nums.length][];
        this.ans = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            arrs[i] = new int[]{nums[i], i};
        }
        int l = 0, r = nums.length - 1;
        mergeSort(arrs, l, r);
        List<Integer> list = new ArrayList<>();
        for (int num : ans) {
            list.add(num);
        }
        return list;
    }

    public void mergeSort(int[][] arrs, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) >> 1;
        mergeSort(arrs, left, mid);
        mergeSort(arrs, mid + 1, right);
        merge(arrs, left, mid, right);
    }

    public void merge(int[][] arrs, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (arrs[i][0] <= arrs[j][0]) {
                temp[k] = arrs[i];
                //计数
                ans[arrs[i][1]] += (j - mid - 1);
                i++;
            } else {
                temp[k] = arrs[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arrs[i];
            //计数
            ans[arrs[i][1]] += (j - mid - 1);
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arrs[j];
            j++;
            k++;
        }
        for (int n = left; n <= right; ++n) {
            arrs[n] = temp[n];
        }
    }
}
