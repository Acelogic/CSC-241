package csc241hw04;

public class ProductBST {
    private ProductNode root;

    public ProductBST() {
        root = null;
    }


    public void insert(Product product) {
        if (root == null) {
            //first node
            root = new ProductNode(product);
            System.out.println("(BST) Root is Empty: New Root is ->" + root.value);
            System.out.println("==========================");
        } else {
            System.out.println("(BST)  Inserting ->" + product);
            root.insert(product);

        }
    }

    // Traversals
    public String inOrder() {
        if (root != null) {
            return root.inOrder();
        }
        return "";
    }

    public String preOrder() {
        if (root != null) {
            return root.preOrder();
        }

        return "";
    }

    public String postOrder() {
        if (root != null) {
            return root.postOrder();
        }

        return "";
    }


    // Check if a value is contained in the tree
    public boolean contains(Product product) {
        // check for an empty tree
        if (root == null) {
            // empty
            return false;
        } else {
            return root.contains(product);
        }
    }

    // Remove a value from the tree
    public void remove(Product product) {
        if (root != null) {
            root = root.remove(product);
        }
    }
}
;