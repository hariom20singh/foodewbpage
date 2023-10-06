
import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BFS(root);
    }

    public static void BFS(TreeNode root) {
        if (root == null) {
            System.out.println("NULL");
        }
        Queue<TreeNode> list = new ArrayDeque<>();
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode node = list.poll();
            System.out.println(node.val);
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
        }

    }
}
