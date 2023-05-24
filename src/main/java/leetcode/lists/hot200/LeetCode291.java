package leetcode.lists.hot200;

import java.util.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/3/12 16:23
 * {@Link Classic1618.go}
 */
//https://leetcode.cn/problems/word-pattern-ii/solution/291-dan-ci-gui-lu-ii-by-klb/
public class LeetCode291 {

    Map<Character, String> map = new HashMap<>();

    public boolean wordPatternMatch(String pattern, String str) {
        if (pattern.length() == 0) {
            return str.length() == 0;
        }
        char letter = pattern.charAt(0);
        for (int i = 1; i <= str.length() - pattern.length() + 1; i++) {
            String substr = str.substring(0, i);
            String mapStr = map.get(letter);
            if ((substr.equals(mapStr)) || (mapStr == null && !map.containsValue(substr))) {
                map.put(letter, substr);
                if (wordPatternMatch(pattern.substring(1), str.substring(i))) {
                    return true;
                } else if (mapStr == null) {
                    map.remove(letter);
                }
            }
        }
        return false;
    }
}
