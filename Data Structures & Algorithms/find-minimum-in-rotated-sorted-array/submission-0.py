class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        _min = nums[0]

        while l <= r:
            
            if nums[r] > nums[l]:
                _min = min(_min, nums[l])
                break

            m = (l + r)//2
            _min = min(_min, nums[m])
            if nums[m] >= nums[l]:
                l = m + 1
            else:
                r = m -1
    
        return _min  