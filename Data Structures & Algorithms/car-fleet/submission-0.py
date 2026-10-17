class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        pos_desc = sorted(zip(position, speed), reverse=True)
        stack = []

        for position, speed in pos_desc:
            time = (target - position) / speed

            if not stack or stack[-1] < time:
                stack.append(time)
        return len(stack)

        