class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        maxArea = 0

        for index, height in enumerate(heights):
            start = index
            while stack and stack[-1][1] > height:
                preIdx, preHeight = stack.pop()
                maxArea = max(maxArea, preHeight * (index - preIdx))
                start = preIdx
                
            stack.append((start, height))

        for i in stack:
            idx, height = i
            width = len(heights) - idx
            maxArea = max(maxArea, width * height)
            

        return maxArea