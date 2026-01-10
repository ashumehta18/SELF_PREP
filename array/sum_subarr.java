//sum of all the subarrays in java
https://www.geeksforgeeks.org/problems/sum-of-subarrays2229/1

class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ;i<n;i++){
            sum += (arr[i]*(i+1)*(n-i));
        }
        return sum;
    }
}
