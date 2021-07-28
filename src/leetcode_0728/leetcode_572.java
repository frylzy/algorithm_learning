package leetcode_0728;

public class leetcode_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) {
            return false;
        }
        boolean res = false;
        if(root.val == subRoot.val) {
            res = isSub(root, subRoot);
        }
        if(res == false) {
            res = isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        return res;
    }
    private boolean isSub(TreeNode root, TreeNode subRoot) {
        if(subRoot == null && root == null) {
            return true;
        }
        if(subRoot == null || root == null) {
            return false;
        }
        return root.val == subRoot.val && isSub(root.left, subRoot.left) && isSub(root.right, subRoot.right);
    }
}
