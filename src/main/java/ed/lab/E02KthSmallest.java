package ed.lab;
import java.util.LinkedList;
import java.util.List;

public class E02KthSmallest {
    LinkedList<Integer> result = new LinkedList<>();

    public int kthSmallest(TreeNode<Integer> root, int k) {
        traverse(root, result); // Traverse inorder to save all nodes in a LinkedList
        return result.get(k - 1); // Return node in k-1 position;
    }

    // Recursive traverse inorder code
    private void traverse(TreeNode<Integer> root, List<Integer> result) {
        if (root == null)
            return;

        traverse(root.left, result);
        result.add(root.value);
        traverse(root.right, result);
    }
}