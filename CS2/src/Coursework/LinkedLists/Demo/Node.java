/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.LinkedLists.Demo;

/**
 *
 * @author jearly
 */
public class  Node {
    
    // Value
    int value;
    
    // Neighbor
    Node next;
    
    // Constructor
    public Node(int v){
        value = v;
        next = null;
    }
    
    
    // Insert
    public void insert(int v) {
        // Terminating condition
        if (next == null) {
            next = new Node(v);
        } else {
            // Recursive step
            next.insert(v);
        }
    }
    
    
    // Return size from this node
    public int size(){
        // base case
        if (next == null) {
            // last node
            return 1;
        } else {
            // ask neighbor
            return next.size() + 1;
        }
    }
    
    // Search
    public boolean contains(int v){
        System.out.println("Comparing: " + value + ":" + v);
        if (v == value) {
            return true;
        } else {
            // Check for neighbor
            if (next == null) {
                return false;
            } else {
                // delagate to neighbor
                return next.contains(v);
            }
        }
    }
}
