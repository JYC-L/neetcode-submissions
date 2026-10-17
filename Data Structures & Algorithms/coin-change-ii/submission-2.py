class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        memo = [[0] * (amount + 1) for _ in range(len(coins) + 1)]
        coins.sort()
        for i in range(len(coins) + 1):
            memo[i][0] = 1
        
        for i in range(len(coins) -1 , -1, -1):
            for j in range(amount + 1):
                if j >= coins[i]:
                    memo[i][j] = memo[i + 1][j]
                    memo[i][j] += memo[i][j - coins[i]]
        return memo[0][amount]
        