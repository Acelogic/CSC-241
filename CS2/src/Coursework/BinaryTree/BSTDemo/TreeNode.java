package Coursework.BinaryTree.BSTDemo;

import java.util.Random;

/**
 *
 * @author jearly
 */
public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    // Constructor
    public TreeNode(int v) {
        value = v;
        left = right = null;
    }

    // Insert a new value
    public void insert(int v) {
        if (v <= value) {
            // goes in left subtree
            if (left == null) {
                // No left child -- create new node
                left = new TreeNode(v);
            } else {
                // Delegate to left child
                left.insert(v);
            }
        } else {
            // goes in right subtree        
            if (right == null) {
                // No right child -- create new node
                right = new TreeNode(v);
            } else {
                // Delegate to right child
                right.insert(v);
            }
        }
    }

    // Traversals
    public String inOrder() {
        String treeStr = "";
        // Go left
        if (left != null) {
            treeStr = left.inOrder();
        }

        // Visit
        treeStr = treeStr + "[" + value + "]";

        // Go right
        if (right != null) {
            treeStr = treeStr + right.inOrder();
        }
        
        // Return the string
        return treeStr;
    }

    

    // Check if value is in the tree
    public boolean contains(int v) {
        if (v == value) {
            // Value found in the current node
            return true;
        } else if (v <= value) {
            // Value could be in left subtree
            if (left == null) {
                // No left child
                return false;
            } else {
                // Delegate to left child
                return left.contains(v);
            }
        } else {
            // Value could be in the right subtree
            if (right == null) {

                // No right child
                return false;
            } else {

                // Delegate to right child
                return right.contains(v);
            }
        }
    }

    // Remove a value from the tree
    public TreeNode remove(int v) {
        // check the subtrees
        if (v < value) {
            // Value must be in the left subtree
            if (left != null) {
                // ask left child to remove value
                left = left.remove(v);
            }
        } else if (v > value) {
            // Value must be in the right subtree
            if (right != null) {
                // ask right child to remove value
                right = right.remove(v);
            }
        } else {
            // Current node getting removed -- OUCH!
            if (left == null && right == null) {
                // Case 1 : no children
                return null;
            } else if (left != null && right == null) {
                // Case 2 - promote left child
                return left;
            } else if (left == null && right != null) {
                // Case 2 - promote right child
                return right;
            } else {
                // Case 3 -- Node with two children
                Random r = new Random();  // Random value generator

                //  (1) Identify a new vlaue, then (2) remove the duplicate
                if (r.nextBoolean()) {
                    // get maximum value from left
                    value = left.rightMost();
                    // remove duplicate from the left
                    left = left.remove(value);
                } else {
                    // get minimum value from right
                    value = right.leftMost();
                    // remove duplicate from the right
                    right = right.remove(value);
                }

            }
        }
        // Return current reference (may have a new value)
        return this;
    }

    protected int leftMost() {
        // returns the left most value
        if (left == null) {
            // no more left children
            return value;
        } else {
            return left.leftMost();
        }
    }

    protected int rightMost() {
        // returns the right most value
        if (right == null) {
            // no more right children
            return value;
        } else {
            return right.rightMost();
        }
    }


}
