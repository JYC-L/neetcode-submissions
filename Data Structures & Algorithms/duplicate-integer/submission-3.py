class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        elems = set(nums)
        return len(elems) != len(nums)