# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        
        current = head
        
        while current.next != None:
            nxt = current.next
            
            if current.val == nxt.val:
                current.next = nxt.next
            else:
                current = nxt
        
        return head