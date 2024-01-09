package leetcode.problems;

import knowledge.advstructure.UnionFind;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/3/16 15:55
 */
public class LeetCode323 {

    public int countComponents(int n, int[][] edges) {
        UnionFind unionFind = new UnionFind(n);
        for (int[] edge : edges) {
            unionFind.union(edge[0], edge[1]);
        }
        return unionFind.getCount();
    }
}
