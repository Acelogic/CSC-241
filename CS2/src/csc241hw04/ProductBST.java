package csc241hw04;


// TODO: Work on this
public class ProductBST {
    private ProductNode root;

    public ProductBST() {
        root = null;
    }


    public void insert(Product product) {
        if (root == null) {
            //first node
            root = new ProductNode(product);
            System.out.println("(BST) Root IS Empty: New Root is -> " + root.value);
        } else {
            root.insert(product);
            System.out.println("(BST) Root Not Empty: Inserting ->" + product);
        }
    }

    public void contains() {

    }

    public void remove() {

    }

    // Traversals
    public String inOrder() {
        if (root != null) {
            return root.inOrder();
        }
        return "";
    }

    public void preOrder() {

    }

    public void postOrder() {

    }


    public static void main(String[] args) {
        ProductBST bst = new ProductBST();
        Product p1 = new Taxable("A", "1", 2, 1 );
        Product p2 = new Taxable("B", "2", 2, 1 );
        Product p3 = new Taxable("C", "3", 2, 1 );
        Product p4 = new Taxable("D", "4", 2, 1 );
        Product p5 = new Taxable("E", "5", 2, 1 );
        Product p6 = new Taxable("F", "6", 2, 1 );

        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);
        bst.insert(p4);
        bst.insert(p5);
        bst.insert(p6);

        System.out.println(bst.inOrder());

    }
}
