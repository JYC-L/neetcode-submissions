class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = 0
        charSet = set()
        maxString = 0

        for right in range(len(s)):
            while s[right] in charSet:
                charSet.remove(s[left])
                left += 1
            charSet.add(s[right])
            maxString = max(maxString, right - left + 1)
        return maxString

        