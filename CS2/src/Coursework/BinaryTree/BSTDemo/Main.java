/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.BinaryTree.BSTDemo;

/**
 *
 * @author jim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create an empty tree
        BinarySearchTree bst1 = new BinarySearchTree();
        
        // Insert some values
        bst1.insert(20);
        bst1.insert(10);
        bst1.insert(30);
        bst1.insert(25);
        bst1.insert(6);
        bst1.insert(15);
        
        // In Order traversal
        System.out.println("IN ORDER: " + bst1.inOrder());
        
//        // Remove value(s)
//        bst1.remove(6);
//        System.out.println("After removing 6...");
//        bst1.inOrder();
//        
//        bst1.remove(30);
//        System.out.println("After removing 30...");
//        bst1.inOrder();
//        
//        bst1.remove(20);
//        System.out.println("After removing 20...");
//        bst1.inOrder();
//        
//        if (bst1.contains(6)) {
//            System.out.println("6 is in the tree");
//        } else {
//            System.out.println("6 is not in the tree");
//        }
//        
//        if (bst1.contains(10)) {
//            System.out.println("10 is in the tree");
//        } else {
//            System.out.println("10 is not in the tree");
//        }
    }
    
}
