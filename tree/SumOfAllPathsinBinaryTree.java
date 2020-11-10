package tree;

/*
 * For Coding Problem Description
 *
 * LeetCode Link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 *
 * */
public class SumOfAllPathsinBinaryTree {

    public int sumRootToLeaf(TreeNode root) {
        return dfsPathSum(root, 0);
    }

    public int dfsPathSum(TreeNode root, int level) {
        if (root == null)
            return 0;
        level = level * 2 + root.val;
        if (root.left == null && root.right == null) {
            return level;
        }
        return dfsPathSum(root.left, level) + dfsPathSum(root.right, level);
    }
}
