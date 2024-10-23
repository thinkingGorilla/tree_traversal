package me.thinking_gorilla;

public class Traverser {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        print("전위 순회: ", root, new InOrder());
        print("중위 순회: ", root, new PreOrder());
        print("후위 순회: ", root, new PostOrder());
    }

    static void print(String description, TreeNode root, Traversable traversable) {
        System.out.print(description);
        traversable.traverse(root);
        System.out.println();
    }
}
