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
public class FindElement {
}
