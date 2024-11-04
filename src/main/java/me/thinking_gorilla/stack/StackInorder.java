package me.thinking_gorilla.stack;

import me.thinking_gorilla.Traversable;
import me.thinking_gorilla.TreeNode;

import java.util.Stack;

public class StackInorder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = node;

        while (current != null || !stack.isEmpty()) {
            // left-root-right 순회에 따라 가장 왼쪽 노드로 이동한다.
            // current가 null, 즉 맨 왼쪽에 도달하면 스택에 노드를 쌓는 것을 그만한다.
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // 가장 왼쪽 노드로 이동 후 left-root-right 순회에 따라 left 노드를 순회하기 위해 pop을 수행한다.
            // 맨 왼쪽노드가  null이면 pop하여 해당 노드를 순회한다.
            // 그리고 오른쪽 부분 트리로 이동하여 다시 맨 왼쪽 부분 트리의 맨 끝 노드들을 스택에 쌓는다.
            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}
