package leetcode.medium;

public class BinaryTreePruning {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }

  }

  public TreeNode pruneTree(TreeNode root) {
    if (root.left != null) {
      root.left = pruneTree(root.left);
    }

    if (root.right != null) {
      root.right = pruneTree(root.right);
    }

    if (root.right == null && root.left == null && root.val == 0) {
      return null;
    } else {
      return root;
    }
  }

}