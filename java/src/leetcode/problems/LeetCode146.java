package leetcode.problems;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/11/1 22:32
 */
public class LeetCode146 {

    class LRUCache {

        LinkedList<Node> list;
        HashMap<Integer, Node> map;
        int capacity;

        public LRUCache(int capacity) {
            this.list = new LinkedList<>();
            this.map = new HashMap<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            Node node = map.get(key);
            list.remove(node);
            list.addFirst(node);
            return node.val;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                list.remove(node);
                list.addFirst(node);
                node.val = value;
                return;
            }
            if (map.size() == capacity) {
                Node node = list.removeLast();
                map.remove(node.key);
            }
            Node node = new Node(key, value);
            list.addFirst(node);
            map.put(key, node);
        }

        static class Node {
            int key;
            int val;

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
    }
}
