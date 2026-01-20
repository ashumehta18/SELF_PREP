https://www.geeksforgeeks.org/problems/lcm-of-two-numbers/1

class Solution {
    public int lcm(int a, int b) {
        // code here
        if(a == 0 || b== 0){
            return 0;
        }
        
        return (int) a*b/gcd(a,b);
    }
    public int gcd(int a , int b){
        return b==0? a:gcd(b,a%b);
    }
}
