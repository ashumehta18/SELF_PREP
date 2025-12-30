https://leetcode.com/problems/same-tree/post-solution/?submissionId=1869010818

//same tree 
//using DFS {deapth first search}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){ //both must be null 
            return true;
        }
        if(p == null || q == null){ //one value null not identical
            return false;
        }

        if(p.val != q.val){ //different values 
            return false;
        }

        return isSameTree(p.left ,q.left) && isSameTree(p.right , q.right); //call left and right subtrees
    }
}
