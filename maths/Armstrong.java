// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int c = count(n);
        int sum = 0 ;
        int num = n;
        
        while(num != 0){
            int d = num%10;
            sum += (int) Math.pow(d,c);
            num /= 10;
        }
        return n == sum;
    }
    
    static int count(int n){
        int c = 0 ;
        while(n != 0){
            c++;
            n = n/10;
        }
        return c;
    }
}
