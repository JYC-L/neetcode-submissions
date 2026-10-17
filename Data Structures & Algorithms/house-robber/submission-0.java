class Solution {
    public int[] stores;
    public int rob(int[] nums) {
        stores = new int[nums.length];
        for (int i = 0; i < stores.length; i++) {
            stores[i] = -1;
        }
        return Math.max(this.dfs(0, nums), this.dfs(1, nums));
        
    }

    public int dfs(int pos, int[] nums) {
        if (pos > nums.length - 1) {
            return 0;
        } 
        if (stores[pos] != -1) return stores[pos];
        return stores[pos] = nums[pos] + Math.max(dfs(pos + 2, nums), dfs(pos + 3, nums));
    }

}
