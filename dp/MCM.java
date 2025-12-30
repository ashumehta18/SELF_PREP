MATRIX CHAIN MULTIPLICATION
  PRIMARY GOAL = To find the most efficient parenthesization for multiplying a 
                  sequence of matrices to minimize the total number of scalar multiplications.

  TO DERIVE THE DIMENSIONS OF ith MATRIX = The dimensions of the i th
                                        a[i] =  matrix are `arr[i-1] x arr[i]`.
                             //previous index and curresnt index = forms the dimension 
  // arr = 40 30 50 60 20 
  // a[1] = arr[0] * arr[1] = 40 * 30 
  //a[2] = 30 * 50 { so b == c property is also maintained }
  3. the cost in terms of scalar multiplications to multiply a matrix of size m×n by a matrix of size n×p = The number of multiplications is m×n×p
  4. The time complexity is exponential, O(2^n) = RECURIVE APPROACH

  Matrix to be multiplied :-
  a*b   c*d
  1. only mmultipied when b and c equal  {base case can be just return if not same}
  2. a *d = dimensions of new matrix formed 
  3. cost = a *b * c [bcz b and c are same so written once] {also called no. of multiplictaion}


example 4 marix are give a b c d apply brackets in such a way that cost multiplication ki minimum ho like :-
  c1 = a*((b*c)*d)
  c2 = (a*b)*(c*d)
  c3 = (a*b*c) *d 
  like ways return minimum among these costs


  class Solution {
    static int matrixMultiplication(int p[]) {
        int n = p.length;
        int dp[][] = new int[n][n];
      
        for(int len = 2; len<=n ;len++){
            for(int i = 1 ; i<= n-len ;i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
              
                for(int k = i ;k<j;k++){
                    int cost = dp[i][k] +dp[k+1][j] +p[i-1] * p[k]*p[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n-1];
    }
}
  
 
