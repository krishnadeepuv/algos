public class RemoveDuplicatesNodes {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return head;

        ListNode curr = head.next;
        ListNode prev = head;

        while (curr != null) {
            if (prev.val == curr.val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}
