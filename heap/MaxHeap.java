// check if a tree is max heap or not ?
https://www.geeksforgeeks.org/problems/is-binary-tree-heap/1

class Solution {
    public int count(Node root){
        if(root == null){
            return 0;
        }
        return 1 + count(root.left)+ count(root.right);
    }
    
    public boolean iscomplete(Node root , int i , int total){
        if(root == null){
            return true;
        }
        if(i>=total){
            return false;
        }
        return iscomplete(root.left , 2*i+1,total) && iscomplete(root.right , 2*i+2,total);
    }
    
    public boolean ismax(Node root){
        if(root.right == null && root.left == null){
            return true;
        }
        if(root.right == null){
            return root.data >= root.left.data && ismax(root.left);
        }
        return root.data >root.left.data && root.data > root.right.data && ismax(root.left) && ismax(root.right);
    }
    public boolean isHeap(Node tree) {
        // code here
        int total = count(tree);
        return iscomplete(tree, 0, total) && ismax(tree);
    }
}
