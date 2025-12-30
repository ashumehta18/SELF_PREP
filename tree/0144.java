//pre order  = if in list form we have to return 
https://leetcode.com/problems/binary-tree-preorder-traversal/post-solution/?submissionId=1868993459

class solution{
  public List<Integer> PreOrderTraversal(TreeNode root){
    List<Integer> output = new ArrayList<>();

    if(root == null){
      return output;
  }
    //pre order = root left right
    output.add(root.data);
    output.addAll(PreOrderTraversal(root.left));
    output.addAll(PreOrderTraversal(root.right));

    return output;
    
}
