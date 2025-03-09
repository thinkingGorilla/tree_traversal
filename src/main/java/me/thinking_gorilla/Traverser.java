package me.thinking_gorilla;

import me.thinking_gorilla.recursive.RecursiveInorder;
import me.thinking_gorilla.recursive.RecursivePostorder;
import me.thinking_gorilla.recursive.RecursivePreorder;

import me.thinking_gorilla.stack.StackInorder;
import me.thinking_gorilla.stack.StackPostorder;
import me.thinking_gorilla.stack.StackPreorder;

public class Traverser {
    public static void main(String[] args) {
        //         10
        //       /    \
        //     5       15
        //    / \     /  \
        //   3   7   13   18
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        print("전위 순회: ", root, new RecursivePreorder());
        print("중위 순회: ", root, new RecursiveInorder());
        print("후위 순회: ", root, new RecursivePostorder());
        
        System.out.println();
        
        print("전위 순회: ", root, new StackPreorder());
        print("중위 순회: ", root, new StackInorder());
        print("후위 순회: ", root, new StackPostorder());
    }

    private static void print(String description, TreeNode root, Traversable traversable) {
        System.out.print(description);
        traversable.traverse(root);
        System.out.println();
    }
}
