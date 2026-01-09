https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> list = new ArrayList<>(); //create 
        for(int i = 0 ; i<arr.length ; i++){
            if(i%2 == 0){ //check for positive index and add it in list 
                list.add(arr[i]);
            }
        }
        return list;
    }
}
