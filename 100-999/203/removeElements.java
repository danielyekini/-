// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0, head);

        ListNode ptr1 = dummy;
        ListNode ptr2 = ptr1.next;
        
        while (ptr2 != null) {
            if (ptr2.val == val) {
                ptr1.next = ptr2.next;
                ptr2 = ptr1.next;
            }
            else {
                ptr1 = ptr1.next;
                ptr2 = ptr1.next;
            }
        }


        return dummy.next;
    }
}