public class ReverseSingleLink {

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }

        return prev;
    }

}
