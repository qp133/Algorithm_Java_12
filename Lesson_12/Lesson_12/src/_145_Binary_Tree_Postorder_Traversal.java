import java.util.ArrayList;
import java.util.List;

public class _145_Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        postOrderHelper(root, list);
        return list;
    }

    public void postOrderHelper(TreeNode node, List<Integer> list) {
        if (node != null) {
            postOrderHelper(node.left, list);
            postOrderHelper(node.right, list);
            list.add(node.val);
        }
    }
}
