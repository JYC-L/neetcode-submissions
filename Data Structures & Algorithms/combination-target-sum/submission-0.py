class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        subset = []

        def dfs(idx:int):
            if idx >= len(nums) or sum(subset) > target:
                return 
            if sum(subset) == target:
                res.append(subset.copy())
                return
            subset.append(nums[idx]);
            dfs(idx)

            subset.pop()
            dfs(idx + 1)

        dfs(0)
        return res


        