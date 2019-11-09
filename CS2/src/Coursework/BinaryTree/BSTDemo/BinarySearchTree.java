package Coursework.BinaryTree.BSTDemo;

/**
 *
 * @author jearly
 */
public class BinarySearchTree {

    private TreeNode root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Insert a new value
    public void insert(int v) {
        if (root == null) {
            // first node
            root = new TreeNode(v);
        } else {
            root.insert(v);
        }
    }

      // Traversals
    public String inOrder() {
        // check if root is null
        if (root != null) {
            return root.inOrder();
        }
        return "";
    }

        // PRE
        // V-L-R

        // IN ORDER
        // L-V-R

        // POST ORDER
        // L-R-V

    // Check if a value is contained in the tree
    public boolean contains(int v) {
        // check for an empty tree
        if (root == null) {
            // empty
            return false;
        } else {
            return root.contains(v);
        }
    }

    // Remove a value from the tree
    public void remove(int v) {
        if (root != null) {
            root = root.remove(v);
        }
    }



}
