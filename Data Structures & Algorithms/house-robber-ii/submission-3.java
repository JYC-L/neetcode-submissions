class Solution {
    private int[][] cache;
    //flag to represent whether or not the robbing starts from the first house 
    public int rob(int[] nums) {
        cache = new int[nums.length][2];
        if (nums.length == 1) return nums[0];
        for (int i =0; i < nums.length; i++) {
            cache[i][0] = -1; //for flag false
            cache[i][1] = -1; //for flag true
        }
        return Math.max(this.dfs(0, 1, nums), this.dfs(1, 0, nums));
        
    }
    //return the max amt of money that can be robbed from this position onward
    private int dfs(int pos, int flag, int[] nums) {
        if (pos > nums.length - 1 || (pos == nums.length - 1 && flag == 1)) {
            return 0;
        }
        
        if (cache[pos][flag] != -1) return cache[pos][flag];
        int skip = dfs(pos + 1, flag, nums);
        int take = nums[pos] + dfs(pos + 2, flag, nums);
        return cache[pos][flag] = Math.max(skip, take);
     }
    //[1, 2, 3]

}
