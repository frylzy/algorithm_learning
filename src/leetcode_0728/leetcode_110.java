package leetcode_0728;

public class leetcode_110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        return Math.abs(leftH - rightH) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
