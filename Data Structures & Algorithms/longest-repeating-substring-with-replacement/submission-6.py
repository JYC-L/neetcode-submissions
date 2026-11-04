class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = defaultdict(int)
        res = l = 0
        mostFreq = 0

        for r in range(len(s)):
            count[s[r]] += 1
            mostFreq = max(mostFreq, count[s[r]])

            while r - l + 1 - mostFreq > k:
                count[s[l]] -= 1
                l += 1
            res = max(res, r - l + 1)
        return res