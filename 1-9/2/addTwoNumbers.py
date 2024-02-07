class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        def listToNum(list):

            list_str = ""

            while list:
                list_str = str(list.val) + list_str
                list = list.next

            return int(list_str)
        
        numSum = listToNum(l1) + listToNum(l2)
        head = lastNode = None
        
        for digit in str(numSum):
            head = ListNode(digit, lastNode) 
            lastNode = head

        return head