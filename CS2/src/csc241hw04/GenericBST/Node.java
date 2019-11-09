package csc241hw04.GenericBST;

import java.util.Random;

public class Node<T extends Comparable<T>> {
    private Node left;
    private Node<T> right;
    private T value;

    public Node(T element) {
        this.value = element;
        left = null;
        right = null;


    }

    public void insert(T element) {
        // if value precedes node product (Negative Case)
        if (element.compareTo(this.value) <= 0) {
            // goes left
            if (left == null) {
                // No left child -- create new node
                left = new Node<>(element);
                System.out.println("(NODE) Left Empty: Going left");
                System.out.println("(NODE) Insert Successful");
                System.out.println("==========================");

            } else {
                //Delegate to left child

                System.out.println("(NODE) " + this.left.value + " is in the way (L)");
                System.out.println("(NODE) Re-running insert() On it ");
                left.insert(element);

            }
            // if value is ahead of node product (Positive Case)
        } else {
            // goes right
            if (right == null) {
                // No right child -- create new node
                right = new Node<>(element);
                System.out.println("(NODE) Right Empty: Going Right");
                System.out.println("(NODE) Insert Successful");
                System.out.println("==========================");


            } else {
                //Delegate to right child

                System.out.println("(NODE) " + this.right.value + " is in the way (R)");
                System.out.println("(NODE) Re-running insert() On it ");
                right.insert(element);

            }
        }

    }


    public boolean contains(T element) {

        if (element == value) {
            // Value found in the current node
            return true;
        } else if (element.compareTo(this.value) <= 0) {
            // Value could be in left subtree
            if (left == null) {
                // No left child
                return false;
            } else {
                // Delegate to left child
                return left.contains(element);
            }
        } else {
            // Value could be in the right subtree
            if (right == null) {

                // No right child
                return false;
            } else {

                // Delegate to right child
                return right.contains(element);
            }
        }
    }

    public Node remove(T element) {
        // check the subtrees
        if (element.compareTo(this.value) < 0) {
            // Check if value is in left subtree
            if (left != null) {
                // Recursively run remove until this this conditional is
                // No longer satisfied
                left = left.remove(element);
            }
        } else if (element.compareTo(this.value) > 0) {
            // Check if value is in right subtree
            if (right != null) {
                // Recursively run remove until this this conditional is
                // No longer satisfied
                right = right.remove(element);
            }
        } else {
            // Conditional when the node is found
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

                //  (1) Identify a new value, then (2) remove the duplicate
                if (r.nextBoolean()) {
                    // get maximum value from left
                    value = (T) left.rightMost();
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


    private T leftMost() {
        // returns the left most value
        if (left == null) {
            // no more left children
            return value;
        } else {
            return (T) left.leftMost();
        }
    }

    private T rightMost() {
        // returns the right most value
        if (right == null) {
            // no more right children
            return value;
        } else {
            return  (T)right.rightMost();
        }
    }

    //Traversals

    // IN ORDER
    // L-V-R
    public String inOrder() {

        String treeStr = "";

        // Left
        if (left != null) {

            System.out.println("(IN-ORDER) Traverse Left");
            treeStr += left.inOrder();
        }

        //Visit

        System.out.println("(IN-ORDER) Visit Value");

        treeStr += this.value;

        // Right
        if (right != null) {

            System.out.println("(IN-ORDER) Traverse Right");
            treeStr += right.inOrder();
        }

        return treeStr;
    }

    // PRE
    // V-L-R
    public String preOrder() {

        String treeStr = "";

        // Visit

        System.out.println(("(PRE-ORDER) Visit Value"));
        treeStr += this.value;

        if (left != null) {

            System.out.println("(PRE-ORDER) Traverse Left");
            treeStr += left.preOrder();
        }

        if (right != null) {

            System.out.println("(PRE-ORDER) Traverse Right");
            treeStr += right.preOrder();
        }

        return treeStr;
    }

    // POST ORDER
    // L-R-V
    public String postOrder() {
        String treeStr = "";

        if (left != null) {

            System.out.println("(POST-ORDER) Traverse Left");
            treeStr += left.postOrder();
        }

        if (right != null) {

            System.out.println("(POST-ORDER) Traverse Right");
            treeStr += right.postOrder();
        }

        //Visit

        System.out.println("(POST-ORDER) Visit Value");
        treeStr += this.value;

        return treeStr;
    }
}

