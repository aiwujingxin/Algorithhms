package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/5/12 21:51
 */
public class LeetCode852 {

    //https://leetcode.cn/problems/peak-index-in-a-mountain-array/solution/gong-shui-san-xie-er-fen-san-fen-cha-zhi-5gfv/

    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (arr[mid - 1] < arr[mid]) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
