https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
class Solution {
    int getMiddle(Node head) {
        // code here
        Node curr = head;
        int len = length(head);
        int mid = len/2; // 5/2 =2
        while(mid>0){ // 1 2 3 4 5
            curr = curr.next; //1 2 3
            mid--;
        }
        return curr.data;
    }
    int length(Node head){
        int count = 0;
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
}
