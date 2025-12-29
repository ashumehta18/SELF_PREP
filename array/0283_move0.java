https://leetcode.com/problems/move-zeroes/submissions/1868068685/

// brute force O(n)= move and shift { new array then copy non zero elemnts and then spaces left is filled with zero }
//better O(n)= two pointer  and two pass  but space O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int fill = 0;

        for(int i = 0 ; i<nums.length ;i++){ //copy non zero elememt
            if(nums[i] != 0){
                nums[fill++] = nums[i];
            }
        }

        while(fill <nums.length){ //remaning pos with zero filled
            nums[fill++] = 0;
        }
    }
}


//optimal O(n) = two pointer and one pass
class Solution {
    public void moveZeroes(int[] nums) {
        int fill = 0; //next slot for non zero 

        for(int i = 0 ; i<nums.length ;i++){
            if(nums[i] != 0){ //swap if non zero 
                if(i != fill){
                    int temp = nums[i];  
                    nums[i] = nums[fill];
                    nums[fill] = temp;
                }
                fill++;
            }
        }
    }
}
