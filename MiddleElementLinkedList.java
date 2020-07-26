public class MiddleElementLinkedList {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode oneStepMove = head;
        ListNode twoStepMove = head;
        if (head != null)
        {
            while (twoStepMove != null && twoStepMove.next != null)
            {
                twoStepMove = twoStepMove.next.next;
                oneStepMove = oneStepMove.next;
            }
           return oneStepMove;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
