package leetcode;

import basic.datastructure.graph.shortestpath.*;

import java.util.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/9/7 17:28
 */
public class LeetCode2737 {

    public int minimumDistance(int n, List<List<Integer>> edges, int s, int[] marked) {
        int[][] es = new int[edges.size()][3];
        for (int i = 0; i < edges.size(); i++) {
            es[i] = new int[]{edges.get(i).get(0), edges.get(i).get(1), edges.get(i).get(2)};
        }
        Dijkstra dijkstra = new Dijkstra();
        int[] dist = dijkstra.getShortestPath(n, es, s);
        System.out.println(Arrays.toString(dist));
        int ans = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int j : marked) {
            set.add(j);
        }
        for (int i = 0; i < dist.length; i++) {
            if (i == s || !set.contains(i)) {
                continue;
            }
            ans = Math.min(ans, dist[i]);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}