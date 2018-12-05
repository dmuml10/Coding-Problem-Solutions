package leetcode.medium;

public class RangeSumBST {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        if (root.left != null) {
            rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            rangeSumBST(root.right, L, R);
        }
        return sum;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
