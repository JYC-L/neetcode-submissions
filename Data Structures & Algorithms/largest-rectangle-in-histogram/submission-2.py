class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        area = 0
        
        for index, height in enumerate(heights):
            start = index
            while stack and stack[-1][1] > height:
                preStart, preHeight = stack.pop()

                area = max(area, preHeight*(index - preStart))
                
                start = preStart
            
            stack.append((start, height))
        
        n = len(heights)

        for i in stack:
            start, height = i
            area = max(area, (n - start)*height)

        return area