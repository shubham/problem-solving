public class MinStack {

    /**
     * initialize your data structure here.
     */

    Node head;

    public MinStack() {
    }

    public void push(int x) {
        Node new_node;
        if (head != null) {
            if (x < head.minValue) {
                new_node = new Node(x, x);
            } else {
                new_node = new Node(x, head.minValue);
            }
        } else {
            new_node = new Node(x, x);
        }
        new_node.next = head;
        head = new_node;
    }
    
    public void pop() {
        head = head.next;
    }

    public int top() {
        if (head != null) {
            return head.data;
        }
        return Integer.MIN_VALUE;
    }

    public int getMin() {
        if (head != null) {
            return head.minValue;
        }
        return Integer.MIN_VALUE;
    }

    class Node {
        int data;
        int minValue = 0;
        Node next;

        Node(int d, int minValue) {
            data = d;
            this.minValue = minValue;
            next = null;
        }
    }

}