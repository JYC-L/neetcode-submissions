class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        mem = {}
        #keep track of the num of times total sum equals target for the (index, total)
        def dfs(i, total):
            if i == len(nums):
                return 1 if total == target else 0
            if (i, total) in mem:
                return mem[(i, total)]
            mem[(i, total)] = dfs(i + 1, total + nums[i]) + dfs(i + 1, total - nums[i])
            return mem[(i, total)]

        return dfs(0, 0)
