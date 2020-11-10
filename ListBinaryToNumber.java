import java.util.HashSet;

public class ListBinaryToNumber {
    public int getDecimalValue(ListNode head) {
        if (head.next == null) {
            return head.val;
        }
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int val = 0;
        while (len > 0) {
            val += (head.val * Math.pow(2, len - 1));
            head = head.next;
            len--;
        }
        return val;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null)
            return false;

        ListNode temp1 = head;
        ListNode temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        //reversing first half
        ListNode prev = null;
        ListNode temp = null;
        ListNode current = head;
        while (current != temp1) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        if (temp2 != null && temp2.next == null) {
            temp1 = temp1.next;
        }
        while (temp1 != null) {
            if (temp1.val != prev.val)
                return false;
            prev = prev.next;
            temp1 = temp1.next;
        }
        return true;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> listNodes = new HashSet<>();
        while (headA.next != null) {
            listNodes.add(headA.next);
            headA = headA.next;
        }
        while (headB.next != null) {
            if (listNodes.contains(headB.next))
                return headB.next;
            headB = headB.next;
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
