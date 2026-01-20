// not executed fully for all cases given at gfg 
class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum = 0;
        for(int i = 1;i<n ;i++){
            if(n%i == 0){
                sum = sum+i;
            }
        }
        return sum==n;
    }
}
