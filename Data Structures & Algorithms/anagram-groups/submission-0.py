class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
       #create a dictionary, with the default value as the empty list
        res = defaultdict(list)
        for s in strs:
            sorted_str = "".join(sorted(s))
            res[sorted_str].append(s)


        return list(res.values())



        