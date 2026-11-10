from sortedcontainers import SortedDict
class TimeMap:

    def __init__(self):
        self.table = defaultdict(SortedDict)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.table[key][timestamp] = value


    def get(self, key: str, timestamp: int) -> str:
        if key not in self.table:
            return ""

        res = ""
        timestamps = self.table[key]
        
        idx = timestamps.bisect_right(timestamp) - 1

        if idx >= 0:
            closest_time = timestamps.iloc[idx]
            res = timestamps[closest_time]
        
        return res 
        
        
