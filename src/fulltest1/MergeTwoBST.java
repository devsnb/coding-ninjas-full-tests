package fulltest1;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeTwoBST {
    static void printMergeTrees(BinaryTreeNode<Integer> root1,
                                BinaryTreeNode<Integer> root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        inOrderTraversal(root1, list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        inOrderTraversal(root2, list2);

        list1.addAll(list2);

        list1.sort(Comparator.comparingInt(o -> o));

        list1.forEach(item -> {
            System.out.print(item + " ");
        });
    }

    private static BinaryTreeNode<Integer> merge(BinaryTreeNode<Integer> t1, BinaryTreeNode<Integer> t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null && t2 != null) {
            return t2;
        } else if (t1 != null && t2 == null) {
            return t1;
        }
        BinaryTreeNode<Integer> sum = new BinaryTreeNode<Integer>(t1.data + t2.data);
        sum.left = merge(t1.left, t2.left);
        sum.right = merge(t1.right, t2.right);
        return sum;
    }

    private static void inOrderTraversal(BinaryTreeNode<Integer> root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }

    private static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }

        public void setRight(BinaryTreeNode<T> root) {
            right = root;

        }

        public void setLeft(BinaryTreeNode<T> root) {
            left = root;

        }
    }
}
