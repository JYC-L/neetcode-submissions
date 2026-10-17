class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {
                ans[0] = prevMap.get(diff);
                ans[1] = i;
            } else {
                prevMap.put(nums[i], i);
            }
        }
        return ans;
        //time complexity o(n)
        //space o(n)
    }
}
