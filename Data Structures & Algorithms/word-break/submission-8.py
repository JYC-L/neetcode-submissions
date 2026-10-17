class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        mem = [False] * (len(s) + 1)
        mem[len(s)] = True
        for i in range(len(s)-1, -1 , -1):
            for w in wordDict:
                if (i + len(w) <= len(s) and s[i: i + len(w)] == w):
                    mem[i] = mem[i + len(w)]
                    if mem[i]: 
                        break
        return mem[0]