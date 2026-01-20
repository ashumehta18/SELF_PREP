/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> l1 = new ArrayList<>();
        Node curr = head;
        while(curr != null){
            l1.add(curr.data);
            curr = curr.next;
        }
        return l1;
    }
}
