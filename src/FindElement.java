/*
4 (code) Find Element in an Encrypted Binary Tree [15 points]
Given that an unencrypted binary tree is defined as one with the following rules:
root.val == 1
For any treeNode:
if treeNode.val == -1 it is an empty node
If treeNode.val has a value x and treeNode.left != null, then treeNode.left.val == 3 * x + 1
If treeNode.val has a value x and treeNode.right != null, then treeNode.right.val == 2 * x + 5
Given an array representation of an encrypted binary tree bt in which all valid treeNode.val have been
changed to -2, and a target value t. Write an algorithm that returns true if t exists as a node value in the
unencrypted binary tree.
Sample Input
bt = [ -2, -2, -1, -2, -1 ]
t = 1
Sample Output
True
 */
import java.util.HashSet;
import java.util.Set;
public class FindElement {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    private final Set<Integer> values;

    public FindElement(TreeNode root){
        values = new HashSet<>();
        if(root != null) {
            root.val = 1;
            recover(root);
        }
    }
    private void recover(TreeNode node){
        if(node == null || node.val == -1){
            return;
        }
        values.add(node.val);
        if(node.left != null && node.left.val != -1){
            node.left.val = 3 * node.val + 1;
            recover(node.left);
        }
        if (node.right != null && node.right.val != -1){
            node.right.val = 2 * node.val + 5;
            recover(node.right);
        }
    }
    public boolean find(int target){
        return values.contains(target);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(-2);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(-2);
        root.left.right = new TreeNode(-1);

        FindElement tree = new FindElement(root);
        System.out.println(tree.find(1));
    }
}
