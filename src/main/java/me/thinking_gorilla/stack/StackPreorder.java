package me.thinking_gorilla.stack;

import me.thinking_gorilla.Traversable;
import me.thinking_gorilla.TreeNode;

import java.util.Stack;

public class StackPreorder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            // 전위 순회이므로 가장 먼저 push된 요소를 꺼내어 순회한다.
            TreeNode current = stack.pop();
            System.out.print(current.val + " ");

            // root-left-right 순으로 순회해야하므로 스택 구조에서 left를 순회하기 위해 먼저 right를 스택에 push한다.
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);
        }
    }
}
