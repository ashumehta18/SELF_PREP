https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
// left rotate
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d%=arr.length;
        rotate(arr, 0 ,d-1);
        rotate(arr, d ,arr.length-1);
        rotate(arr , 0 ,arr.length-1);
    }
    
    public static void rotate(int arr[] , int start ,int end){
       while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end ] = temp;
        start++;
        end--;
       }
    }
}



//right roate by k position
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d%=arr.length;
        rotate(arr, 0 ,arr.length -1);
        rotate(arr, 0 ,d-1);
        rotate(arr , d ,arr.length-1);
    }
    
    public static void rotate(int arr[] , int start ,int end){
       while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end ] = temp;
        start++;
        end--;
       }
    }
}
