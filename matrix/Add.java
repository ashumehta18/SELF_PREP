// add 2 different matrix
https://www.geeksforgeeks.org/dsa/program-addition-two-matrices/
// User function Template for Java

class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
       
        int r = matrixB.length;
        int c = matrixB[0].length;
        
        for(int i = 0 ;i<r;i++){
            for(int j = 0 ;j<c;j++){
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }
}
