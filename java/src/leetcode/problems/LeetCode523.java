package leetcode.problems;

import java.util.HashMap;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/12/21 21:27
 * @description 同余定理
 * (preSum[i]−preSum[j]) mod k==0 ⟺ (preSum[i] mod k) == (preSum[j] mod k)
 */
public class LeetCode523 {

    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            int key = sum[i] % k;
            if (map.containsKey(key)) {
                if (i - map.get(key) >= 2) {
                    return true;
                }
            } else {
                map.put(key, i);
            }
        }
        return false;
    }
}
