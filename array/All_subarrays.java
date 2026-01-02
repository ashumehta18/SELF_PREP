https://www.geeksforgeeks.org/problems/generating-all-subarrays/1

// generate all subarray 
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ;i<arr.length ;i++){
            for(int j = i; j<arr.length ;j++){
                List<Integer> list = new ArrayList<>();
                for(int k = i ;k<=j ;k++){
                   list.add(arr[k]); 
                }
                result.add(list);
            }
        }
        return result;
    }
}
