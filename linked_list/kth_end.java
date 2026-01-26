https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

class Solution {

    int getKthFromLast(Node head, int k) {
        // Your code here
        int count = 0;
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        if(k>count){
            return -1;
        }
        curr = head;
        int find = count - k; //9-2 = 7 
        for (int i = 1; i < find+1; i++){ //8
            curr = curr.next;
        }
        return curr.data;
        
    }
}
