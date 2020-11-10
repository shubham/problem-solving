import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextLargerNode {
    public int[] nextLargerNode(ListNode head) {
        ListNode temp = head;
        List<Integer> nodeList = new ArrayList<>();
        while (temp != null) {
            nodeList.add(temp.val);
            temp = temp.next;
        }
        int[] result = new int[nodeList.size()];
        Stack<Integer> nodeStack = new Stack<>();
        for (int i = nodeList.size() - 1; i > 0; i--) {
            while (nodeStack.size() > 0 && nodeStack.peek() <= nodeList.get(i))
                nodeStack.pop();
            if (nodeStack.size() == 0) {
                result[i] = 0;
            } else {
                result[i] = nodeStack.peek();
            }
            nodeStack.push(nodeList.get(i));
        }

        return result;
    }

    //reversing a linked list
//    public ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        ListNode temp = null;
//        ListNode curr = head;
//        while (curr != null) {
//            temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        System.out.println();
//        return prev;
//    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = null;
        ListNode curr = head;
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        return prev;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        Stack<Integer> numStack = new Stack<>();
        while (temp != null) {
            if (numStack.isEmpty()) {
                numStack.push(temp.val);
                System.out.println("stack empty :"+ temp.val);
            } else if (numStack.peek() == temp.val) {
                while (numStack.peek() == temp.val) {
                    System.out.println("removing duplicate from list: "+temp.val);
                    temp = temp.next;
                }
                System.out.println("removing duplicate from stack: "+numStack.peek());
                numStack.pop();
            } else {
                numStack.push(temp.val);
                System.out.println("push element to stack: "+temp.val);
            }
            temp = temp.next;
        }
        if (numStack.isEmpty()) {
            return null;
        } else {
            for (Integer integer : numStack) {
                System.out.println("Stack: "+integer);
            }
            temp = null;
            while (!numStack.isEmpty()) {
                int val = numStack.pop();
                ListNode next = new ListNode(val);
                next.next = temp;
                temp = next;
            }
            head = temp;
        }
        return head;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        if (head == null) return head;
        ListNode fake = new ListNode(-1, head);
        int k = 0;
        ListNode pre = null, cur = fake, next = null;
        while (k < m) {
            pre = cur;
            cur = cur.next;
            k++;
        }
        ListNode tail = cur;
        next = cur.next;
        while (k++ < n && next != null) {
            ListNode temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
        }
        tail.next = next;
        pre.next = cur;
        return fake.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
