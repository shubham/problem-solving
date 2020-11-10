public class AddTwoNumberLL {
    ListNode current;
    ListNode result = null;
    private int carry = 0;

    public void addElements(int val) {
        ListNode nextNode = new ListNode(val);
        nextNode.next = result;
        result = nextNode;
    }

    public void addRestOfList(ListNode one) {
        if (one == null)
            return;

        if (one.next != current)
            addRestOfList(one.next);
        int sum = 0;
        sum = one.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        addElements(sum);
    }

    public void addNumber(ListNode one, ListNode two) {
        if (one == null)
            return;

        if (one.next != null)
            addNumber(one.next, two.next);
        int sum = 0;
        sum = sum + carry;
        sum += one.val + two.val;
        carry = sum / 10;
        sum = sum % 10;
        addElements(sum);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = 0;
        int len2 = 0;
        ListNode temp = l1;
        while (temp != null) {
            len1 += 1;
            temp = temp.next;
        }
        temp = l2;
        while (temp != null) {
            len2 += 1;
            temp = temp.next;
        }
        if (Math.abs(len1 - len2) == 0) {
            addNumber(l1, l2);
        } else {
            if (len1 > len2) {
                temp = l1;
                for (int i = 0; i < (len1 - len2); i++) {
                    current = temp;
                    temp = temp.next;
                }
                addTwoNumbers(current, l2);
                temp = l1;
            } else {
                temp = l2;
                for (int i = 0; i < (len2 - len1); i++) {
                    current = temp;
                    temp = temp.next;
                }
                addTwoNumbers(current, l1);
                temp = l2;
            }
            addRestOfList(temp);
        }
        if (carry > 0)
            addElements(carry);
        return result;
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
