https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
class Solution {
    int missingNum(int arr[]) {
        // code here
       long s1 = 0;
       
       long n = arr.length +1 ;
       long s2 = n*(n+1)/2;
       for(int i = 0 ;i<arr.length;i++){
           s1 +=arr[i];
       }
       return  (int)(s2-s1);
    }
}
