package me.thinking_gorilla.stack;

import me.thinking_gorilla.Traversable;
import me.thinking_gorilla.TreeNode;

import java.util.Stack;

public class StackPostorder implements Traversable {
    public void traverse(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = node;
        TreeNode lastVisited = null;

        while (!stack.isEmpty() || current != null) {
            // 중위 순회와 마찬가지로 가장 왼쪽 노드로 이동한다.
            // current가 null, 즉 맨 왼쪽에 도달하면 스택에 노드를 쌓는 것을 그만한다.
            if (current != null) {
                stack.push(current);
                current = current.left; // 왼쪽 자식으로 계속 이동
            } else {
                // 왼쪽 부분트리가 null이라면 오른쪽 부분 트리를 순회할지 결정해야한다.
                // 왼쪽 부분트리가 null이라면 현재 노드가 루트가 된다.
                // 후위 순회에서 루트노드는 가장 마지막에 순회해야하므로
                // peek() 메서드를 사용하여 오른쪽 부분 트리가 있는지 확인한다.
                TreeNode peekNode = stack.peek();

                // lastVisited 플래그 제어를 하지 않으면,
                // 우측 노드 방문 후 루트 노드로 돌아간 뒤, 다시 우측 노드로 내려오는 문제가 발생한다.
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    // 방문할 오른쪽 부분 트리가 없다는 것은 이 노드가 루트 노드임을 말한다.
                    System.out.print(peekNode.val + " ");
                    // 루트 노드 순회 후 다시 우측 노드로 내려오는 문제를 막기 위해 플래그를 사용한다.
                    lastVisited = stack.pop();
                }
            }
        }
    }
}
