package csc241hw04.GenericBST;


import csc241hw04.Product;
import csc241hw04.Taxable;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;


    public BinarySearchTree() {
        root = null;
    }

    
    public void insert(Comparable element) {
        if (root == null) {

            root = new Node<>((T) element);
        } else {
            root.insert((T) element);
        }
    }

    
    public boolean isEmpty() {
        return (root == null);
    }

    
    public boolean contains() {
        return false;
    }

    
    public boolean remove() {
        return false;
    }

    
    public Comparable get(Comparable element) {
        return null;
    }

    
    public void add(Comparable element) {

    }

    
    public int reset(int orderType) {
        return 0;
    }

    
    public Comparable getNext(int orderType) {
        return null;
    }


    
    public String inOrder(){
        if(root != null) {
            return root.inOrder();
        }
        return "";
    }
    public static void main(String[] args) {
        Product p1 = new Taxable("A", "1", 2, 1 );
        Product p2 = new Taxable("B", "2", 2, 1 );
        Product p3 = new Taxable("C", "3", 2, 1 );
        Product p4 = new Taxable("D", "4", 2, 1 );
        Product p5 = new Taxable("E", "5", 2, 1 );
        Product p6 = new Taxable("F", "6", 2, 1 );
       /* BinarySearchTree<Product> bst = new BinarySearchTree<>();

        bst.insert("A");
        bst.insert("C" );
        bst.insert("B" );
        bst.insert("D");
        System.out.println(bst.inOrder());
*/
    }
}

