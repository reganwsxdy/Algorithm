/**
 * 求树的深度，用后序遍历
 * */

public class test_104 {
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth , rightDepth) + 1;
    }
}
