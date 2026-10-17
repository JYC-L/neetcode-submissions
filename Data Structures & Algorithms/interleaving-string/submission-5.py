class Solution:
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        mem = {} # mem will only store (i1, i2): True/False, no need to store i3 since i1 + i2 must equals to i3
        def dfs(i1, i2, i3):
            if i3 == len(s3):
                return i2 == len(s2) and i1 == len(s1)
            if (i1, i2) in mem:
                return mem[(i1, i2)]
            res = False
            if i1 < len(s1) and s1[i1] == s3[i3]: #to account for case "ab", "ab", "abcabc" where the i1 or i2 can become out of bound
                res = dfs(i1 + 1, i2, i3 +1)
            # if the res is false, give it another chance 
            if not res and i2 < len(s2) and s2[i2] == s3[i3]:
                res = dfs(i1, i2 + 1, i3 + 1)
            mem[(i1, i2)] = res
            return res
        return dfs(0, 0, 0)
        

       