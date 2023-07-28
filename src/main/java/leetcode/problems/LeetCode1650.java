package leetcode.problems;

import common.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/7/28 16:55
 */
public class LeetCode1650 {

    public Node lowestCommonAncestor(Node p, Node q) {
        Node curP = p;
        Node curQ = q;
        while (curP != curQ) {
            curP = (curP == null) ? q : curP.parent;
            curQ = (curQ == null) ? p : curQ.parent;
        }
        return curP;
    }
}
