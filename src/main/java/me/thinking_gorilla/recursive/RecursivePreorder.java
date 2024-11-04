package me.thinking_gorilla.recursive;

import me.thinking_gorilla.Traversable;
import me.thinking_gorilla.TreeNode;

public class RecursivePreorder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        // Since it is a preorder traversal, this node is processed first.
        System.out.print(node.val + " ");
        traverse(node.left);
        traverse(node.right);
    }
}
