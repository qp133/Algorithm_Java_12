public class MyBinarySearchTree {
    //Duyệt tiền thứ tự
    public void preOrder(Node root) {
        //Đk dừng: duyệt tới khi nào không còn node để duyệt nữa
        if (root == null) {
            return;
        }

        //Duyệt gốc -> in roor ra luôn
        System.out.print(root.value + "\t");

        //Duyệt trái -> Đệ quy
        preOrder(root.left);

        //Duyệt phải
        preOrder(root.right);
    }

    //Duyệt inOrder
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        //Duyệt trái
        inOrder(root.left);

        //Duyệt gốc
        System.out.print(root.value + "\t");

        //Duyệt phải
        inOrder(root.right);
    }

    //Duyệt hậu thứ tự
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        //Duyệt trái
        postOrder(root.left);

        //Duyệt phải
        postOrder(root.right);

        //Duyệt gốc
        System.out.print(root.value + "\t");
    }
}
