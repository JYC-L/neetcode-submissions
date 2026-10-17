class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        a = []
        for i, n in enumerate(nums):
            if n in a:
                return True
            a.append(n)
        return False 
