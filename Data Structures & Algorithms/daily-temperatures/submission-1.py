class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        res = [0]* len(temperatures)
        for index, temp in enumerate(temperatures):
            while len(stack) > 0 and stack[-1][0] < temp:
                res[stack[-1][1]] = index - stack[-1][1]
                stack.pop()
            stack.append((temp, index))

        return res