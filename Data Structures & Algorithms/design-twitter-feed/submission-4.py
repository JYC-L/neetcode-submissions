class Twitter:

    def __init__(self):
        self.followees = defaultdict(set)
        self.tweets = defaultdict(list)
        self.timestamp = 0
        

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.timestamp -= 1
        if userId not in self.tweets:
            self.tweets[userId] = []
        self.tweets[userId].append((self.timestamp, tweetId))

        

    def getNewsFeed(self, userId: int) -> List[int]:
        minHeap = []
        res = []

        self.followees[userId].add(userId) #[1:[101], 2:[102]], {1:{}, 2:{2, 1}}
        for followee in self.followees[userId]:
            if followee in self.tweets:
                index = len(self.tweets[followee]) - 1
                ts, tweetId = self.tweets[followee][index]
                minHeap.append((ts, tweetId, followee, index))
        heapq.heapify(minHeap)

        while minHeap and len(res) < 10:
            ts, tweetId, followee, index = heapq.heappop(minHeap)
            res.append(tweetId)
            if index - 1 >= 0:
                ts, tweetId = self.tweets[followee][index - 1]
                heapq.heappush(minHeap, (ts, tweetId, followee, index -1))
        return res

        

    def follow(self, followerId: int, followeeId: int) -> None:
        self.followees[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if followeeId in self.followees[followerId]:
            self.followees[followerId].remove(followeeId)
        
