
class Solution {
    public int knapsack(int W, int val[], int wt[]) {

        int n = wt.length;              // number of items
        int[][] dp = new int[n+1][W+1]; // DP table

        for(int i = 1; i <= n; i++){        // items
            for(int j = 1; j <= W; j++){    // capacity
                if(wt[i-1] <= j){           // item fits
                    dp[i][j] = Math.max(
                        val[i-1] + dp[i-1][j - wt[i-1]], // include
                        dp[i-1][j]                       // exclude
                    );
                } else {
                    dp[i][j] = dp[i-1][j]; // cannot include Ignore curr item Carry forward previous result
                }
            }
        }
        return dp[n][W];
    }
}
