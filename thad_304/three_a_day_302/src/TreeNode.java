public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }//叶结点

    TreeNode(int val, TreeNode left, TreeNode right) {//非叶结点
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
