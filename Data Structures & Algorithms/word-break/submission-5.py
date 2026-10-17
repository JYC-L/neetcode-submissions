class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        mem = {len(s): True}
        def dfs(i):
            if i in mem:
                return mem[i]
            for word in wordDict:
                if (i + len(word) <= len(s) and s[i: i + len(word)] == word):
                    if dfs(i + len(word)):
                         mem[i] = True
                         return True
            mem[i] = False
            return False
        return dfs(0) 

        