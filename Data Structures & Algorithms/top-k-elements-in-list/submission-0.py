class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequency = Counter(nums)
        sorted_freq = dict(sorted(frequency.items(), key=lambda item : item[1], reverse = True))
        res = []
        while (k - 1 >= 0):
            res.append(list(sorted_freq.keys())[k-1])
            k -= 1

        return res