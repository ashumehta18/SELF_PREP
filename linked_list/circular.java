https://www.geeksforgeeks.org/problems/circular-linked-list/1
/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        if(head == null){
            return true;
        }
        
        Node curr = head;
        Node temp = head;
        while(curr != null && curr.next != temp){
            curr = curr.next;
            
        if(curr == null || curr.next == null){
            return false;
        }
        }    
        return true;
    }
}
