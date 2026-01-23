https://www.geeksforgeeks.org/problems/closest-number5728/1

class Solution {
    static int closestNumber(int n, int m) {
        int q = n/m; //recive quotient
        
        int n1 = m*q; //first no.
        
        int n2 = n*m>0 ? m*(q+1) : m*(q-1); // depends upon sign -ve if handles easily 
        
         return (Math.abs(n-n1)<Math.abs(n-n2)) ? n1 :n2; // which difference is lower
    }
}
