class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        
        def dfs(i, total, flag):
            res = 0
            res = total + nums[i] if flag is True else total - nums[i]
            if i == len(nums) - 1:
                return 1 if res == target else 0
            return dfs(i + 1, res, True) + dfs(i + 1, res, False) 
        return dfs(0, 0, True) + dfs(0, 0, False)
        