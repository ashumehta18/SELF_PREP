https://leetcode.com/problems/3sum/
//brute_force
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> l2 = new ArrayList<>();
        int n = arr.length;
        for(int i = 0 ;i<n-2;i++){
            for(int j = i;j<n-1;j++){  
                for(int k = j ; k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0 && i != j && j != k && k != i){
                         List<Integer> l1 = new ArrayList<>(3);
                        l1.add(arr[i]);
                        l1.add(arr[j]);
                        l1.add(arr[k]);
                        Collections.sort(l1);
                        if(!l2.contains(l1)){
                        l2.add(l1);
                        }
                    }
                }
            }
        }
        return l2;
    }
}
