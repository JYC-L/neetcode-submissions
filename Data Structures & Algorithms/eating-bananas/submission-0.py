class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        largestPile = max(piles)
        left = 1
        right = largestPile
        res = 0

        while left <= right:
            mid = left + (right - left)//2
            total = 0
            for i in range(len(piles)):
                total += math.ceil(float(piles[i])/mid)
            if total <= h:
                res = mid
                right = mid - 1
            else:
                left = mid + 1
        return res
        

