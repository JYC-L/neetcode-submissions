from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = []
        counts = Counter(nums)
        freq = [[] for i in range(len(nums) + 1)]
        for num, count in counts.items():
            freq[count].append(num)

        for i in range(len(freq)-1, 0, -1):
            for num in freq[i]:
                res.append(num)
                if k == len(res):
                    return res