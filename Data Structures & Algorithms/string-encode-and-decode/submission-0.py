class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        for st in strs:
            res += str(len(st)) + "#" + st
        return res
        ['2', 'adb', 'd']
            


    def decode(self, s: str) -> List[str]:
        '1#i3#ih45#asbdc'
        res = []
        length = len(s)
        i = 0
        while i < length:
            #use another cur to get to #
            j = i 
            while s[j] != '#':
                j += 1
            lengthOfStr = int(s[i:j])
            res.append(s[j + 1: j + 1 + lengthOfStr])
            i = j + 1 + lengthOfStr
        return res

            

