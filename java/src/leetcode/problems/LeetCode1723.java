package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2024/3/13 22:30
 */
public class LeetCode1723 {

    int res = Integer.MAX_VALUE;

    public int minimumTimeRequired(int[] jobs, int k) {
        backtrack(jobs, new int[k], 0, k, 0);
        return res;
    }

    private void backtrack(int[] jobs, int[] times, int i, int k, int max) {
        if (i == jobs.length) {
            res = Math.min(max, res);
            return;
        }
        for (int j = 0; j < k; j++) {
            //每次分配任务，如果前面有人是没有任务的，就停止搜索
            if (j > 0 && times[j - 1] == 0) {
                continue;
            }
            // times[j] == times[j - 1] 那么把cur分配给当前工人或是 分配给前一个工人，本质上没有区别，没必要再算一次
            if (j > 0 && times[j] == times[j - 1]) {
                continue;
            }
            times[j] += jobs[i];
            if (Math.max(times[j], max) < res) {
                backtrack(jobs, times, i + 1, k, Math.max(times[j], max));
            }
            times[j] -= jobs[i];
        }
    }
}