# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:

        if head == None:
            return None

        dummy = ListNode(0, head)
        pivot = tail = dummy
        count = 0

        while tail.next:
            tail = tail.next
            count += 1

        for _ in range(count - (k % count)):
            pivot = pivot.next
        
        tail.next = head
        dummy.next = pivot.next
        pivot.next = None

        return dummy.next