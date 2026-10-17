class Solution:
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        mem = {}
        def dfs(i1, i2, i3):
            if i3 == len(s3):
                mem[(i1, i2, i3)] = i2 == len(s2) and i1 == len(s1)
                return mem[(i1, i2, i3)]
            if (i1, i2, i3) in mem:
                return mem[(i1, i2, i3)]
            if i1 < len(s1) and s1[i1] == s3[i3]: #to account for case "ab", "ab", "abcabc"
                if dfs(i1 + 1, i2, i3 + 1):
                    mem[(i1, i2, i3)] = True
                    return True
            if i2 < len(s2) and s2[i2] == s3[i3]:
                if dfs(i1, i2 + 1, i3 + 1):
                    mem[(i1, i2, i3)] = True
                    return True
            mem[(i1, i2, i3)] = False
            return False
        return dfs(0, 0, 0)
        

       