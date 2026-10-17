class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexSet = {}
        for i in range(len(nums)):
            remain = target - nums[i]
            if remain in indexSet:
                if i < indexSet[remain]:
                    return [i, indexSet[remain]]   
                else:
                    return [indexSet[remain], i]   
            else:
                indexSet[nums[i]] = i
        return 0
        
