package me.thinking_gorilla.recursive;

import me.thinking_gorilla.Traversable;
import me.thinking_gorilla.TreeNode;

public class RecursivePostorder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        traverse(node.left);
        traverse(node.right);
        // Since it is a post-order traversal, this node is processed after the left and right nodes are processed.
        System.out.print(node.val + " ");
    }
}
