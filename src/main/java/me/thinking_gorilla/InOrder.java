package me.thinking_gorilla;

public class InOrder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null)  return;

        traverse(node.left);
        // Since it is an in-order traversal, this node is processed after the left is processed.
        System.out.print(node.val + " ");
        traverse(node.right);
    }
}
