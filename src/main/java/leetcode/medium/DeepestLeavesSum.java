package leetcode.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int step = 0;

        findLeave(root, step, map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        return map.get((Integer) Collections.max(map.keySet()));
    }

    public void findLeave(TreeNode node, int step, Map<Integer, Integer> map) {
        if (node.left == null && node.right == null) {
            System.out.println("## " + node.val + " " + step);
            map.put(step, map.getOrDefault(step, 0) + node.val);
        }
        step++;
        if (node.left != null) {
            findLeave(node.left, step, map);
        }
        if (node.right != null) {
            findLeave(node.right, step, map);
        }
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
