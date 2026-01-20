https://www.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        // code here
        int count = 0;
        //Node get = new Node(key);
        Node curr = head;
        while(curr != null){
            if(curr.data == key){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}
