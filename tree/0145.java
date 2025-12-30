https://leetcode.com/problems/binary-tree-postorder-traversal/post-solution/?submissionId=1869004348

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null ){
            return result ;
        }

        // left right root 
        result.addAll( postorderTraversal(root.left));
        result.addAll( postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
}
