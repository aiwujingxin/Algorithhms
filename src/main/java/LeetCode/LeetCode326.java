package LeetCode;

/**
 * @author jingxinwu
 * @date 2021-12-26 8:54 PM
 */
public class LeetCode326 {


    public boolean isPowerOfThree(int n) {
        if (n <= 2) {
            return false;
        }
        return n > 0 && 1162261467 % n == 0;
    }
}
