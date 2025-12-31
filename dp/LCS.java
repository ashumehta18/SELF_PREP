//longest common subsequence
https://leetcode.com/problems/longest-common-subsequence/post-solution/?submissionId=1869903940
two strings  are given s1 and s2 find the longest common subsequence and return its length if no found return zero 


  recursive :-
  class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1, text2, text1.length(), text2.length());
    }
     private int lcs(String text1, String text2, int m, int n) {
        // Base case: If either string length becomes 0
        if (m == 0 || n == 0) {
            return 0;
        }
        
        // If last characters match
        if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
            return 1 + lcs(text1, text2, m - 1, n - 1);
        } else {
            // If they don't match, try both options
            return Math.max(lcs(text1, text2, m - 1, n), lcs(text1, text2, m, n - 1));
        }
     }
}


dp = bottom up dp [better ]
  class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[m][n];
    }
}
  
  
