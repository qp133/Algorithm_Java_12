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

    public Node insert(Node root, int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
            return root;
        } else {
            Node temp = root;
            while (true) {
                if (val < temp.value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
        return root;
    }

    public Node remove(Node root, int key) {
        if (root == null) {
            return null;
        }

        //B1: Tìm node cần xóa
        if (key < root.value) {         //Node cần xóa nằm ở bên trái
            //đệ quy
            root.left = remove(root.left, key);
        } else if (key > root.value) {      //Node cần xóa nằm ở bên phải
            root.right = remove(root.right, key);
        } else {            //Tìm được node cần xóa
            //TH1: node cần xóa là node lá
            if (root.left == null && root.right == null) {
                return null;
            }
            //TH2: node cần xóa có 1 node con
            if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            }
            //TH3: node cần xóa có 2 nốt con
            Node leftNode = findLeftNode(root.right);
            root.value = leftNode.value;
            root.right = remove(root.right, leftNode.value);
        }
        return root;
    }

    //Tìm Node trái cùng của cây con bên phải
    public Node findLeftNode(Node root) {
        if (root == null) {
            return null;
        }

        Node leftNode = root;
        while (leftNode.left != null) {
            leftNode = leftNode.left;
        }
        return leftNode;
    }
}
