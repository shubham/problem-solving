package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryPreOrderTraversal {

    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        Node temp;
        while (!nodeStack.isEmpty()) {
            temp = nodeStack.pop();
            result.add(temp.val);
            if (!temp.children.isEmpty()) {
                for (int i = temp.children.size() - 1; i > -1; i--) {
                    System.out.println(temp.children.get(i).val);
                    nodeStack.push(temp.children.get(i));
                }
            }
        }
        return result;
    }

    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        return depth(root, 1);
    }

    public int depth(Node root, int depth) {
        if (root == null)
            return 0;
        if (root.children.size() == 0)
            return depth;
        List<Integer> result = new ArrayList<>();
        for (Node node : root.children) {
            result.add(depth(node, depth + 1));
        }
        int max=0;
        for (Integer num : result) {
            if (num>max)
                max=num;
        }
        return max;
    }

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
