https://www.geeksforgeeks.org/problems/1-d-prefix-sum/1

class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(arr[0]);
        for(int i = 1 ;i<n ;i++){
            list.add(list.get(i-1) + arr[i]);
        }
        return list;
    }
}
