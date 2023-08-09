package leetcode.problems;

import java.util.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/3/15 21:47
 */
public class LeetCode320 {

    // todo 题解
    public static void main(String[] args) {
        System.out.println(new LeetCode320().generateAbbreviations("wordawqwertyu").size());
    }

    public List<String> generateAbbreviations(String word) {
        if (word == null || word.length() == 0) {
            return new ArrayList<>();
        }
        Set<String> res = new HashSet<>();
        res.add(word);
        helper(word, res, 0);
        return new ArrayList<>(res);
    }

    private void helper(String word, Set<String> res, int start) {
        if (start == word.length()) {
            return;
        }
        for (int i = start; i <= word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String t = word;
                String sb = word.substring(0, i) + (j - i) + word.substring(j);
                res.add(sb);
                // important fixed bug 下一次开始的位置
                int left = word.length() - 1 - j;
                helper(sb, res, sb.length() - left);
                word = t;
            }
        }
    }
}