https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
class Solution {
    public static int gcd(int a, int b) {
        // Eculedian theorm 
       return (b == 0) ? a : gcd(b, a % b);
    // if b is zero return a 
      //else call the function again using recursive calls = where a wi
    }
}
