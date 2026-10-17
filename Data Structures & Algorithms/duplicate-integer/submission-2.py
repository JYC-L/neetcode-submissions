class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        numSet = set(nums)
        return True if len(numSet) is not len(nums) else False
        