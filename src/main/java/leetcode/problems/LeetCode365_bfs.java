package leetcode.problems;

import java.util.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/10/20 00:08
 * <a href="https://leetcode.com/problems/water-and-jug-problem/discuss/2427669/BFS-Easy-JAVA">...</a>
 * <a href="https://www.youtube.com/watch?v=vdKQgyvAUVA">...</a>
 */
public class LeetCode365_bfs {

    public boolean canMeasureWater(int c1, int c2, int target) {
        if (c1 + c2 < target) {
            return false;
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited.add(0);
        while (!q.isEmpty()) {
            int top = q.poll();
            if (top == target) {
                return true;
            }

            if (top + c1 <= c1 + c2 && !visited.contains(top + c1)) {
                q.add(top + c1);
                visited.add(top + c1);
            }
            if (top - c1 >= 0 && !visited.contains(top - c1)) {
                q.add(top - c1);
                visited.add(top - c1);
            }
            if (top + c2 <= c1 + c2 && !visited.contains(top + c2)) {
                q.add(top + c2);
                visited.add(top + c2);
            }
            if (top - c2 >= 0 && !visited.contains(top - c2)) {
                q.add(top - c2);
                visited.add(top - c2);
            }
        }
        return false;
    }
}