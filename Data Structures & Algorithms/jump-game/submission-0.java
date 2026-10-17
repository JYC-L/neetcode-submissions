class Solution {
    public boolean canJump(int[] nums) {
        return this.dfs(0, nums);
    }

    public boolean dfs(int i, int[] nums) {
        if (i == nums.length - 1) return true;
        for (int j = 1; j <= nums[i]; j++) {
            if (dfs(i + j, nums)) return true;
        }
        return false;
    }
}
