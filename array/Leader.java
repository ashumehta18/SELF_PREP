https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length-1; 
        int max = arr[n]; //set max to last element
      
        for(int i = n ;i>=0 ;i--){ //reverse loop
           if(arr[i] >= max){ //check to update max
                max = arr[i];
                list.add(arr[i]); //add element each time we got max
            }
        }
        Collections.reverse(list); //reverse list 
        return list;
    }
}
