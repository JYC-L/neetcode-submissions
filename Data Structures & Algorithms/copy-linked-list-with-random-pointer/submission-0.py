"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def __init__(self):
        self.map = {}
    
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return None
        if head in self.map:
            return self.map[head]
        node = Node(head.val)
        self.map[head] = node
        node.next = self.copyRandomList(head.next)
        node.random = self.map.get(head.random) or None
        return node
