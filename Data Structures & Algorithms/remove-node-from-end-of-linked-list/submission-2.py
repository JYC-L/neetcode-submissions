# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    #two pass 
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        total = 0
        cur = head
        while cur:
            total += 1
            cur = cur.next

        i1 = total - n
        target, prev = head, head
        i2 = i1 - 1
        

        while i2 > 0:
            prev = prev.next
            i2 -= 1
        
        while i1 > 0:
            target = target.next
            i1 -= 1
        
        
        if target == head:
            head = head.next
        else:
            prev.next = target.next

        return head
        
        