class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        mem = {}
        def dfs(i):
            if i in mem:
                return mem[i]
            if i == len(s):
                return True
            for word in wordDict:
                if (i + len(word) <= len(s) and s[i: i + len(word)] == word):
                    if dfs(i + len(word)):
                         mem[i] = True
                         return True
            mem[i] = False
            return False
        return dfs(0) 

        