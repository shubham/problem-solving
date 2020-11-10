import java.util.Stack;

public class AddNumberLLUsingStack {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> one = new Stack<>();
        Stack<Integer> two = new Stack<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                one.push(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                two.push(l2.val);
                l2 = l2.next;
            }
        }
        ListNode result = null;
        int carry = 0;
        int valOne;
        int valTwo;
        int sum;
        while (!one.isEmpty() || !two.isEmpty() || carry != 0) {
            valOne = 0;
            valTwo = 0;
            if (!one.isEmpty()) {
                valOne = one.pop();
            }
            if (!two.isEmpty()) {
                valTwo = two.pop();
            }
            sum = valOne + valTwo + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            node.next = result;
            result = node;
        }
        return result;
    }

    //    public ListNode detectCycle(ListNode head) {
//        Set<ListNode> nodeSet = new HashSet<>();
//        ListNode temp = head;
//        while (temp != null) {
//            if (nodeSet.contains(temp))
//                return temp;
//            else
//                nodeSet.add(temp);
//            temp = temp.next;
//        }
//        return null;
//    }
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                break;
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        while (temp != null && slow != null) {
            if (temp == slow) return slow;
            temp = temp.next;
            slow = slow.next;
        }
        return null;
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
