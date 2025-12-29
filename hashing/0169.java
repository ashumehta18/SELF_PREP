https://leetcode.com/problems/majority-element/

// Boyer-Moore Voting Algorithm
/*
1. used to find the majority element among the given elements that have more than N/ 2 occurrences. 
2. O(N), as it involves two passes over the array.
3. O(1), as it uses a constant amount of extra space.
4. Step 1 is to find a candidate for the majority element,
           Step 2 is to verify if that candidate has more than N/2 votes.
           The variable `votes` is initialised to 0,
           `candidate` is initialised to a sentinel value like -1.
 5. A new candidate is chosen when the `votes` counter becomes 0.
 6. action is taken when the current array element matches the `candidate = `votes` counter is incremented.
 7. action is taken when the current array element does not match the `candidate` = `votes` counter is decremented.
  */

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count =0;
        for(int i = 0 ;i<nums.length ;i++){
            if(count == 0){
                candidate = nums[i];
            }
            count += (nums[i] == candidate) ? +1 :-1;
        }
        return candidate;
    }
}
