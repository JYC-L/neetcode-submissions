class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        res = 0
        sortedIntervals = sorted(intervals, key=lambda pair: pair[0])
        prevEnd = sortedIntervals[0][1]
        for i in range(1, len(sortedIntervals)):
            if sortedIntervals[i][0] >= prevEnd:
                prevEnd = sortedIntervals[i][1]
            else:
                res += 1
                prevEnd = min(prevEnd, sortedIntervals[i][1])
        return res
