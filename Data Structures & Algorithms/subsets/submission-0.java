class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> subset = new ArrayList<>();

        this.dfs(0, subset, res, nums);
        return res;

        
        
    }

    public void dfs(int i, List<Integer> subset,
    List<List<Integer>> res, int[] nums) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
           
        //decision to include the num
        subset.add(nums[i]);
        dfs(i+1, subset, res, nums);

        //decision to not include the num
        subset.remove(subset.size() - 1);
        dfs(i+1, subset, res, nums);


    }
}
