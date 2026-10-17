class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # maxProfit = 0
        # left = 0
        # while left < len(prices) - 1:
        #     right = left + 1
        #     while right < len(prices):
        #         profit = prices[right] - prices[left]
        #         if profit > maxProfit:
        #             maxProfit = profit
        #         right += 1
        #     left += 1
        # if maxProfit == 0:
        #     return 0
        # return maxProfit
        max_profit = 0
        left, right = 0, 1

        while right < len(prices):
            if prices[right] > prices[left]:
                profit = prices[right] - prices[left]
                max_profit = max(max_profit, profit)
            else:
                left = right
            right += 1
        
        return max_profit

