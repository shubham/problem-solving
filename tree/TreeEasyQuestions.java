package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeEasyQuestions {
    boolean result = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val == sum && root.left == null && root.right == null)
            return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }


    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return false;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int value = root.val;
        TreeNode node;
        boolean result = false;
        while (!nodeQueue.isEmpty()) {
            node = nodeQueue.poll();
            if (node.val == value)
                result = true;
            else {
                result = false;
                break;
            }
            if (node.left != null)
                nodeQueue.add(node.left);
            if (node.right != null)
                nodeQueue.add(node.right);
        }
        return result;
    }

    public boolean evaluateTree(TreeNode root, int value) {
        boolean right = false;
        boolean left = false;
        if (root.left != null)
            left = root.val == root.left.val && evaluateTree(root.left, value);
        if (root.right != null)
            right = root.val == root.right.val && evaluateTree(root.right, value);

        return left && right;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int maxLevel = 0;
        int currLevel = 0;
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        treeNodes.add(null);
        TreeNode node;
        while (!treeNodes.isEmpty()) {
            node = treeNodes.poll();
            if (node == null) {
                if (currLevel > maxLevel) {
                    maxLevel = currLevel;
                }
                if (!treeNodes.isEmpty())
                    treeNodes.add(null);
                currLevel = 0;
            }
            if (node != null) {
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
                currLevel++;
            }
        }
        return maxLevel + 1;
    }
}
