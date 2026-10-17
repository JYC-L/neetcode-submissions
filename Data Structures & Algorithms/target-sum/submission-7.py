class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        #bottom up
        mem = [defaultdict(int) for _ in range(len(nums) + 1)]
        mem[0][0] = 1
        for i in range(len(nums)):
            for total, count in mem[i].items():
                mem[i + 1][total + nums[i]] += count
                mem[i + 1][total - nums[i]] += count
        return mem[len(nums)][target] 
