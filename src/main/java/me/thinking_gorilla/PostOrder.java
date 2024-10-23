package me.thinking_gorilla;

public class PostOrder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        traverse(node.left);
        traverse(node.right);
        // Since it is a post-order traversal, this node is processed after the left and right nodes are processed.
        System.out.print(node.val + " ");
    }
}
