https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1
// User function Template for Java

class Solution {
    static int findNthTerm(int n) {
        // code here
        //differnce is increasing by +! each time
        if(n == 1){
            return 1;
        }
        return findNthTerm(n-1) +n;
    }
};
