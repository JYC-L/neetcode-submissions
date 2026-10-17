class Solution {
    public String longestPalindrome(String s) {
        int startidx = 0;
        int longestLen = 0;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 
                || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (longestLen < j - i + 1) {
                        longestLen = j - i + 1;
                        startidx = i;
                    }
                } 
            }
        }
        return s.substring(startidx, startidx + longestLen);
        
    }
}
