import java.util.*;

public class BSTTester {
    public static void main(String[] args){
        LinkedBinarySearchTree<Integer> BST = new LinkedBinarySearchTree<Integer>();
        BST.addElement(11);
        BST.addElement(6);
        BST.addElement(8);
        BST.addElement(19);
        BST.addElement(4);
        BST.addElement(10);
        BST.addElement(5);
        BST.addElement(17);
        BST.addElement(43);
        BST.addElement(49);
        BST.addElement(31);
        //For Coursemology Q1
        System.out.println(inOrder(BST.root, new ArrayList<Integer>()));
        System.out.println(preOrder(BST.root, new ArrayList<Integer>()));
        System.out.println(postOrder(BST.root, new ArrayList<Integer>()));
        System.out.println(levelOrder(BST));
        // For Coursemology Q2
        System.out.println(BST);

        // For Coursemology Q3
        ArrayList<Integer> preOrder = new ArrayList<Integer>(Arrays.asList(11, 6, 4, 5, 8, 10, 19, 17, 43, 31, 49));
        ArrayList<Integer> inOrder = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 8, 10, 11, 17, 19, 31, 43, 49));
        System.out.println(constructTree(preOrder, inOrder));
    }

    // Q1: Complete the inOrder Traversal here
    public static ArrayList<Integer> inOrder(BinaryTreeNode curr, ArrayList<Integer> result){
        if (curr != null) {
            inOrder(curr.left, result);
            result.add((Integer) curr.element);
            inOrder(curr.right, result);
        }
        return result;
    }

    // Q1: Complete the preOrder Traversal here
    public static ArrayList<Integer> preOrder(BinaryTreeNode curr, ArrayList<Integer> result){
        if (curr != null) {
            result.add((Integer) curr.element);
            preOrder(curr.left, result);
            preOrder(curr.right, result);
        }
        return result;
    }

    // Q1: Complete the postOrder Traversal here
    public static ArrayList<Integer> postOrder(BinaryTreeNode curr, ArrayList<Integer> result){
        if (curr != null) {
            postOrder(curr.left, result);
            postOrder(curr.right, result);
            result.add((Integer) curr.element);
        }
        return result;
    }

    // Q1: Complete an iterative levelOrder Traversal here
    public static ArrayList<Integer> levelOrder(LinkedBinarySearchTree<Integer> BST){
        ArrayList<Integer> result = new ArrayList<>();
        if (BST.root == null) {
            return result;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(BST.root);

        while (!queue.isEmpty()) {
            BinaryTreeNode curr = queue.poll();
            if (curr != null) {
                result.add((Integer) curr.element);
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
        }

        return result;
    }

    // Q3: Complete the following method to construct a tree from the pre and in order traversals
    // You may add your own auxillary methods
    public static LinkedBinarySearchTree<Integer> constructTree(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder){
        LinkedBinarySearchTree<Integer> bst = new LinkedBinarySearchTree<>();
        bst.root = recursiveTreeConstructor(preOrder, inOrder, 0, 0, inOrder.size() - 1);
        return bst;
    }

    private static BinaryTreeNode<Integer> recursiveTreeConstructor(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder, int preInd, int inStart, int inEnd) {
        if (preInd >= preOrder.size() || inStart > inEnd) return null;

        int root = preOrder.get(preInd);
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(root);

        node.left = recursiveTreeConstructor(preOrder, inOrder, preInd + 1, inStart, inOrder.indexOf(root) - 1);
        node.right = recursiveTreeConstructor(preOrder, inOrder, preInd + 1 + inOrder.indexOf(root) - inStart, inOrder.indexOf(root) + 1, inEnd);

        return node;
    }
}