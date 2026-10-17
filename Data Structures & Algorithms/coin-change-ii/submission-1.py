class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        coins.sort()
        mem = {}
        def dfs(i, r):
            if r == 0:
                return 1
            if i == len(coins):
                return 0
            if (i, r) in mem:
                return mem[(i, r)]
            res = 0
            if r >= coins[i]:
                res = dfs(i + 1, r) #skip the cur coin and targe does not change 
                res += dfs(i, r - coins[i]) #add the current coin, reuse the same
            mem[(i, r)] = res
            return res

        return dfs(0, amount)