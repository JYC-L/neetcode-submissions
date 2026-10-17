class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()



        def backtrack(i: int, output: List[int]):
            if sum(output) == target:
                res.append(output[::])
                return
            if sum(output) > target or i == len(candidates):
                return
            output.append(candidates[i])
            backtrack(i + 1, output)
            output.pop()
            while i + 1 < len(candidates) and candidates[i] == candidates[i+1]:
                i += 1
            backtrack(i + 1, output)
        
        backtrack(0, [])
        return res
        

        

