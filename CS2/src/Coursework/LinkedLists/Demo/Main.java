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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyList ml1 = new MyList();
        System.out.println("SIZE(BEFORE):" + ml1.size());
        ml1.insert(12);
        ml1.insert(15);
        System.out.println("SIZE(AFTER):" + ml1.size());
        
        System.out.println("CONTAINS(15):" + ml1.contains(15));
        System.out.println("CONTAINS(17):" + ml1.contains(17));
        
        

    }

}
