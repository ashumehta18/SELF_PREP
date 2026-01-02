https://www.geeksforgeeks.org/problems/minimum-increment-by-k-operations-to-make-all-equal/1
class Solution {
    static int minOps(int arr[], int k) {
        
       int max = Integer.MIN_VALUE; //maximum value correct atti h instead of keeping it zero 
       int res = 0 ;
       for(int i = 0 ;i<arr.length;i++){ //to get max
           if(max<arr[i]){
               max = arr[i];
           }
       }
       
       for(int i = 0 ;i<arr.length ;i++){ //itterate
           if((max -arr[i]) %k != 0){ //if max mai se lement subract krke value k se fully divide nhi hoti 
               return -1;
           }else{
               res+=(max -arr[i])/k; //if hoje then no. of operation = subtracted value ko k se divide krdo 
           }
       }
       return res;
    }
}
