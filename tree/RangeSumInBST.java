package tree;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumInBST {

    int ans = 0;

    //level order approach
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        int sum = 0;
        Queue<TreeNode> value = new LinkedList<>();
        value.add(root);
        TreeNode temp;
        while (!value.isEmpty()) {
            temp = value.poll();
            System.out.println(temp.val);
            if (temp.val >= L && temp.val <= R)
                sum = sum + temp.val;

            if (temp.right != null)
                value.add(temp.right);

            if (temp.left != null)
                value.add(temp.left);
        }
        return sum;
    }

    public int rangeSumBSTRecursive(TreeNode root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
        return ans;
    }

    public void dfs(TreeNode root, int L, int R) {
        if (root != null) {
            if (L <= root.val && root.val <= R) {
                ans = ans + root.val;
            }
            if (L < root.val) {
                dfs(root.left, L, R);
            }
            if (root.val < R)
                dfs(root.right, L, R);
        }
    }
}
