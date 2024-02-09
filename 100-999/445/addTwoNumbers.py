# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        l1_ptr = l1
        l2_ptr = l2
        l1_str = l2_str = ""
        
        while l1_ptr != None or l2_ptr != None:
            if l1_ptr != None:
                l1_str += str(l1_ptr.val)
                l1_ptr = l1_ptr.next
            if l2_ptr != None:
                l2_str += str(l2_ptr.val)
                l2_ptr = l2_ptr.next
        
        sum = int(l1_str) + int(l2_str)
        dummy = sum_list = ListNode()
        for i in str(sum):
            sum_list.next = ListNode(int(i))
            sum_list = sum_list.next
            
        return dummy.next