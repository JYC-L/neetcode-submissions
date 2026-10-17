class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        res = [1] * length
        prefix, postfix = 1, 1
        for i in range(length):
            res[i] = prefix
            prefix *= nums[i]
        for i in reversed(range(length)):
            res[i] *= postfix
            postfix *= nums[i]
        return res
        