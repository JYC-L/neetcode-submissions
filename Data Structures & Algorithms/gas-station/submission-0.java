class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //gas [1,2,2,3] cost [1, 1,4,5] 
        //if the cost is higher than the total gas, there is no way we can finish the route without
        //going into negative
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;
        int total = 0;
        int res = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i];
            total -= cost[i];
            if (total < 0) {
                //reset the total and re-test from the next index
                total = 0;
                res = i + 1;
            }
        }
        if (res >= gas.length) return -1;
        return res;
        
    }
}
