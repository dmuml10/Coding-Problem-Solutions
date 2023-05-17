package leetcode.easy;

public class MaxLengthOfBinaryTree {

    int max = 0;
    public int maxDepth(TreeNode root) {

        traverse(root, 0);
        return max;
    }

    private void traverse(TreeNode root, int count) {
        if (root != null) {

            count++;
            if (count > max) {
                max = count;
            }
            traverse(root.left, count);
            traverse(root.right, count);
        }
    }

}
