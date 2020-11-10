package tree;

public class NumOfPathCountWithGivenSum {
    private int count = 0;

    public int pathSum(TreeNode root, int sum) {
        pathSumRec(root, sum);
        return count;
    }

    public void dfs(TreeNode root, int sum, int tempSum) {
        if (root == null)
            return;

        else if (root != null) {
            tempSum = tempSum + root.val;
            if (sum == tempSum)
                count++;
        }
        dfs(root.left, sum, tempSum);
        dfs(root.right, sum, tempSum);
    }

    public void pathSumRec(TreeNode root, int sum) {
        if (root == null)
            return;
        dfs(root, sum, 0);
        pathSumRec(root.left, sum);
        pathSumRec(root.right, sum);
    }
}
