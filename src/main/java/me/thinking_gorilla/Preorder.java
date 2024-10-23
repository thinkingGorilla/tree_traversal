package me.thinking_gorilla;

public class Preorder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        // Since it is a preorder traversal, this node is processed first.
        System.out.print(node.val + " ");
        traverse(node.left);
        traverse(node.right);
    }
}
