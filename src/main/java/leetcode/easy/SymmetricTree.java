package leetcode.easy;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return traverse(root.left, root.right);
    }

    private boolean traverse(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val && traverse(node1.left, node2.right) && traverse(node1.right, node2.left);
    }

}
