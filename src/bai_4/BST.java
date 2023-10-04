package bai_4;

public class BST {
    public class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            root = null;
        }

        // Hàm thêm một phần tử vào cây
        void insert(int key) {
            root = insertRec(root, key);
        }

        // Hàm đệ qui thêm một phần tử vào cây
        Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.key) {
                root.left = insertRec(root.left, key);
            } else if (key > root.key) {
                root.right = insertRec(root.right, key);
            }

            return root;
        }

        // Hàm thực hiện duyệt theo thứ tự postorder
        void postorderTraversal(Node root) {
            if (root != null) {
                // Bước 1: Duyệt cây con bên trái
                postorderTraversal(root.left);
                // Bước 2: Duyệt cây con bên phải
                postorderTraversal(root.right);
                // Bước 3: Truy cập nút gốc
                System.out.print(root.key + " ");
            }
        }

        public void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();

            // Thêm các phần tử vào cây
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            System.out.println("Duyệt theo thứ tự postorder:");
            tree.postorderTraversal(tree.root);
        }
    }
}
