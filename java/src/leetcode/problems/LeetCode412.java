package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/9/29 00:23
 */
public class LeetCode412 {

    public List<String> fizzBuzz(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        int index = 1;
        while (index <= n) {
            if (index % 3 == 0 && index % 5 == 0) {
                list.add("FizzBuzz");
            } else if (index % 5 == 0) {
                list.add("Buzz");
            } else if (index % 3 == 0) {
                list.add("Fizz");

            } else {
                list.add(String.valueOf(index));
            }
            index++;
        }
        return list;
    }
}
