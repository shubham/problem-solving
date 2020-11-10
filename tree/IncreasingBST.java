package tree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBST {
    List<TreeNode> nodeList = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return null;
        dfs(root);
        TreeNode result = nodeList.get(0);
        result.left = null;
        if (nodeList.size() >=2)
            result.right = nodeList.get(1);
        for (int i = 1; i < nodeList.size() - 1; i++) {
            nodeList.get(i).left = null;
            nodeList.get(i).right = nodeList.get(i + 1);
        }
        return result;
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null)
            dfs(root.left);
        nodeList.add(root);
        if (root.right != null)
            dfs(root.right);
    }
}
