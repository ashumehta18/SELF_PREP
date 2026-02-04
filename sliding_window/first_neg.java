https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> l1 = new ArrayList<>();
        Queue<Integer> q1 = new LinkedList<>();
        int n = arr.length;
        int i = 0 ,j = 0 ;
        while(j<n){
            if(arr[j]<0){
                q1.add(j);
            }
            if(j-i+1<k){
                j++;
            }else{
                while(!q1.isEmpty() && q1.peek() < i){
                    q1.poll();
                }
                if(q1.isEmpty()){
                    l1.add(0);
                }else{
                    l1.add(arr[q1.peek()]);
                }
                i++;
                j++;
            }
        }
        
        return l1;
    }
}
