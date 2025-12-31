https://leetcode.com/problems/two-sum/post-solution/?submissionId=1870300730

class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2]; //resultant array size
    ans[0] = -1 ;
    ans[1] = -1;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0;i<nums.length;i++){
    int one = nums[i];
    int two = target -one;

    if(map.containsKey(two)){
        ans[0] = map.get(two);
        ans[1] = i;
        return ans;
    }
        map.put(nums[i],i);
    }
    return ans;  
    }       
}

