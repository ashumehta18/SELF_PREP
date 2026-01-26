//leetcode
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            if(curr.val != stack.pop().val) return false;
            curr = curr.next;
        }
        return true;
    }
}
