class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        charset = set(s)
        res = 0
        for char in charset:
            l = 0
            replacement = 0
            count = defaultdict(int)
            for r in range(len(s)):
                count[s[r]] += 1
                if s[r] != char: 
                    replacement = r - l + 1 - count[char]
                    while replacement > k:
                        count[s[l]] -= 1
                        l += 1
                        replacement = r - l + 1 - count[char]
                res = max(res, r - l + 1)
        return res  



        