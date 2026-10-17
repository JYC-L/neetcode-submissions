class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<Integer, Boolean> memo = new HashMap<>();
        return dfs(0, s, wordDict, memo);
        
        
    }
    private boolean dfs(int position, String s, List<String> wordDict
    , Map<Integer, Boolean> memo) {
            if (position == s.length()) {
                return true;
                }
            if (memo.containsKey(position)) {
                return memo.get(position);
            }
            for (int end = position + 1; end < s.length() + 1; end++) {
                String word = s.substring(position, end);
                if (wordDict.contains(word) && dfs(end, s, wordDict, memo)) {
                    memo.put(position, true);
                    return true;
                }
            }
            memo.put(position, false);
            return false;
    }
}

    
