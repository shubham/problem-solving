package tree;

/*
 * Hard Problem : Find Max Path Sum
 * Detail in Below link
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * */
public class MaxPathSum {
    int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        Result res = new Result();
        res.val = Integer.MIN_VALUE;
        maxPathSumRecursive(root, res);
        return res.val;
    }

    public int maxPathSumRecursive(TreeNode root, Result res) {
        int maxValueTop = 0;
        if (root == null)
            return 0;
        int left = maxPathSumRecursive(root.left, res);
        int right = maxPathSumRecursive(root.right, res);

        int maxVal = Math.max(root.val, Math.max(left, right) + root.val);
        int maxUp = Math.max(maxVal, left + right + root.val);

        res.val = Math.max(res.val, maxUp);
        return maxVal;
    }

    class Result {
        public int val;
    }
}
