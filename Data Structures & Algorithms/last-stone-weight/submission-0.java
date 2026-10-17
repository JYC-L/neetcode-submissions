class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> weightList = new PriorityQueue<>();
        for (int i: stones) {
            weightList.offer(-i);
        }
        while (weightList.size() > 1) {
            int firstStone = weightList.poll();
            int secondStone = weightList.poll();
            if (secondStone > firstStone) weightList.offer(firstStone - secondStone);
        }

        weightList.offer(0);
        return Math.abs(weightList.peek());
        
    }
}
