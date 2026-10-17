class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        s1Counter, s2Counter = [0]*26, [0]*26
        for i in range(len(s1)):
            s1Counter[ord(s1[i]) - ord('a')] += 1
            s2Counter[ord(s2[i]) - ord('a')] += 1

        matches = 0
        for i in range(26):
           if s1Counter[i] == s2Counter[i]:
                matches += 1
        
        l = 0
        for r in range(len(s1), len(s2)):
            if matches == 26:
                return True
            index1 = ord(s2[r]) - ord('a')
            s2Counter[index1] += 1
            if s2Counter[index1] == s1Counter[index1]:
                matches += 1
            elif s2Counter[index1] - 1 == s1Counter[index1]:
                matches -= 1

            index2 = ord(s2[l]) - ord('a')
            s2Counter[index2] -= 1
            if s2Counter[index2] == s1Counter[index2]:
                matches += 1
            elif s2Counter[index2] + 1 == s1Counter[index2]:
                matches -= 1
            l += 1
        return matches == 26
    
            


