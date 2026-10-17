# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        # find the mid node 
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        #reverse the last half
        second = slow.next
        prev = None
        slow.next = None
        while second:
            temp = second.next
            second.next = prev
            prev = second 
            second = temp
        
        #merge two halves
        first, second = head, prev
        while second:
            temp1, temp2 = first.next, second.next
            first.next = second
            second.next = temp1
            first, second = temp1, temp2

        
        # [1, 2] [3, 4, 5]
        # [1, 2, 3, 4]


      