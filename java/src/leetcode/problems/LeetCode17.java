package leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/12/18 16:38
 */
public class LeetCode17 {
    HashMap<Integer, String> map;
    List<String> res;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        map = new HashMap<>();
        res = new ArrayList<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < map.get(digits.charAt(index) - '0').length(); i++) {
            sb.append(map.get(digits.charAt(index) - '0').charAt(i));
            backtrack(digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

