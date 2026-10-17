class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        
        def dfs(i, total):
            if i == len(nums):
                return 1 if total == target else 0
            plus = total + nums[i]  
            minus = total - nums[i]
            return dfs(i + 1, plus) + dfs(i + 1, minus)
        return dfs(0, 0)