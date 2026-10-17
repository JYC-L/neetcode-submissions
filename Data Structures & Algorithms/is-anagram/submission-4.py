class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        charMap = {}
        for i in s:
            if i in charMap:
                charMap[i] += 1
            else:
                charMap[i] = 1

        for i in t:
            if i in charMap:
                charMap[i] -= 1
            else:
                return False
        
        return all(count == 0 for count in charMap.values())
            
        