public class HW_98_Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        boolean leftNode = isBST(root.left, min, root.val);
        boolean rightNode = isBST(root.right, root.val, max);

        return leftNode && rightNode;
    }
}
