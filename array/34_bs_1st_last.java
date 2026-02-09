https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// 1. brute = by linear search 
//2. the way performed using 2 different function 
//3. but it can be performed using one single function
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = f(nums,target);
        res[1] = l(nums,target);
        return res;
    }
     public int f(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length -1;
        int ans = -1;
        while(left<=right){
            int mid = left +(right - left)/2;
            if(nums[mid] == target){
                ans =  mid;
                right = mid -1;
            }
            else if(nums[mid]>target){
                right = mid -1;
            } else{
                left = mid+1;
            }
        }
        return ans;
     }
     public int l(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length -1;
        int ans = -1;
        while(left<=right){
            int mid = left +(right - left)/2;
            if(nums[mid] == target){
                ans =  mid;
                left = mid +1;
            }
            else if(nums[mid]>target){
                right = mid -1;
            } else{
                left = mid+1;
            }
        }
        return ans;
     }
}
