class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        df = [amount + 1] * (amount + 1) #  amount: minCount, initiate the min count for as large as possible 
        # the largest possible smallest count to make amount is amount so we choose amount + 1
        df[0] = 0
        for i in range(1, amount + 1):
            for coin in coins:
                if i - coin >= 0:
                    df[i] = min(df[i], 1 + df[i - coin])
        return df[amount] if df[amount] != amount + 1 else -1


                    
