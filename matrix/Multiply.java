class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        ArrayList<ArrayList<Integer>> l1 = new ArrayList<>();
        
        int r1 = mat1.length;
        int r2=mat2.length;
        int c1= mat1[0].length;
        int c2 =mat2[0].length;
        int[][] res = new int[r1][c2];
        
        if(c1 != r2){
            return null;
        }
        
        for(int i = 0 ;i<r1;i++){
            ArrayList<Integer> l2 = new ArrayList<>();
            for(int j = 0 ;j<c2;j++){
                res[i][j] = 0;
                for (int k = 0; k < c1; k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
                l2.add(res[i][j]);
            }
            l1.add(l2);
        }
        return l1;
    }
}
