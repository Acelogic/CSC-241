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
public class MyList {
    
    // First node
    Node head;
    
    // Constructor
    public MyList(){
        head = null;
    }
    
    // Insert
    public void insert(int v){
        // Terminating condition
        if (head == null) {
            // first node
            head = new Node(v);
        } else {
            // Recursive part
            head.insert(v);
        }
    }
    
    // size of the list
    public int size(){
        // base case
        if (head == null) {
            return 0;
        } else {
            return head.size();
        }
    } 
    
    // contains
    public boolean contains(int v){
        if (head == null) {
            // empty list
            return false;
        } else {
            return head.contains(v);
        }
    }
}
