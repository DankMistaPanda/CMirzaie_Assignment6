/*
6 (code) BR Tree, Delete Elements in Range [15 points]
Given a BR Tree brt, and two integers a and b, write a function to delete all the nodes that have values
within the inclusive range [𝑎, 𝑏] from the tree.
Note: You Must use a Node implementation of a BR Tree and the resulting trees should remain valid BR
Trees.
Examples: Suppose a BR Tree has keys: {10, 19, 20, 30, 42, 55, 77}
A call to inRange(15, 20) the tree would have the keys {10, 30, 42, 55, 77}
A call to inRange(0, 2) the tree would have the keys {10, 19, 20, 30, 42, 55, 77}
A call to inRange(25, 60) the tree would have the keys {10, 19, 20, 77}
 */

public class DeleteElements {
    static class BSTNode{
        int data;
        BSTNode left, right;
        BSTNode(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static BSTNode leftMost(BSTNode root){
        if (root == null)
            return null;
        while (root.left != null)
            root = root.left;
        return root;
    }
    static BSTNode deleteNode(BSTNode root){
        if (root.left == null) {
            BSTNode child = root.right;
            root = null;
            return child;
        } else if(root.right == null){
            BSTNode child = root.left;
            root = null;
            return child;
        }
        BSTNode next = leftMost(root.right);
        root.data = next.data;
        root.right = deleteNode(root.right);

        return root;
    }
    static BSTNode removeRange(BSTNode node, int a, int b){
        if(node == null){
            return null;
        }
        node.left = removeRange(node.left, a, b);
        node.right = removeRange(node.right, a, b);

        if(node.data >= a && node.data <= b)
            return deleteNode(node);
        return node;
    }
    static void inorder (BSTNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String args[]){
        BSTNode root = new BSTNode(30);
        root.left = new BSTNode(19);
        root.right = new BSTNode(55);
        root.left.right = new BSTNode(20);
        root.right.right = new BSTNode(77);
        root.right.left = new BSTNode(42);
        root.left.left = new BSTNode(10);

        System.out.print("Inorder Before Deletion: ");
        inorder(root);

        root = removeRange(root, 15, 20);

        System.out.print("\nInorder After Deletion: ");
        inorder(root);
    }
}
