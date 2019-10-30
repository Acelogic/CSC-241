package csc241hw04;


// TODO: Work on this
public class ProductNode {
    private ProductNode left;
    private ProductNode right;
    public Product value;

    public ProductNode(Product product) {
        this.value = product;
        left = null;
        right = null;

    }

    public void insert(Product product) {
        // if value precedes node product
        if (product.compareTo(this.value) <= 0) {
            // goes left 
            if (left == null) {
                // No left child -- create new node
                left = new ProductNode(product);
                System.out.println("(NODE) Left Empty: Going left");

            } else {
                //Delegate to left child
                left.insert(product);
                System.out.println("(NODE) Left Not Empty: Re-running insert() ");
            }
            // if value is ahead of node product
        } else {
            // goes right 
            if (right == null) {
                // No right child -- create new node
                right = new ProductNode(product);
                System.out.println("(NODE) Right Empty: Going Right");

            } else {
                //Delegate to right child
                right.insert(product);
                System.out.println("(NODE) Right Not Empty: Re-running insert() ");
            }
        }

    }

    public boolean contains() {

        return false;
    }

    public void remove() {

    }

    //Traversals

    // In Order ( L-V-R)
    public String inOrder() {
        String treeStr = "";

        // Left
        if (left != null) {
            System.out.println("(NODE) Visiting Left");
            treeStr = left.inOrder();
        }

        //Visit
       // treeStr = value + treeStr;
        treeStr += value;

        // Right
        if (right != null) {
            System.out.println("(NODE) Visiting Right");
            treeStr = right.inOrder();
        }

        return treeStr;
    }

    public void preOrder() {

    }

    public void postOrder() {

    }
}
