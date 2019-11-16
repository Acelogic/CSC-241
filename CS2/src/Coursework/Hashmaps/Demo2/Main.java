/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Hashmaps.Demo2;

import java.util.HashMap;

/**
 *
 * @author jearly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create CDs
        CompactDisc cd1 = new CompactDisc("87654321", 9.99, "Bob Dylan", "Highway 61");
        CompactDisc cd2 = new CompactDisc("76543210", 10.99, "Beatles", "Abbey Road");
        CompactDisc cd3 = new CompactDisc("76543210", 12.99, "Beatles", "Let It Be");
        
  
        HashMap< String, CompactDisc > cdDatabase = new HashMap();
        cdDatabase.put(cd1.getUpc(), cd1);
        cdDatabase.put(cd2.getUpc(), cd2);

        // Try to add CD3
        System.out.println("TESTING: "+cdDatabase.put(cd3.getUpc(), cd3));
        
        
        System.out.println("SIZE: " + cdDatabase.size());


        System.out.println("--== For Loop Starts Now ==--");
        // get all keys
        for (String k : cdDatabase.keySet()) {
            System.out.println("KEY: " + k);
        }

        System.out.println("--== For Loop Ends ==--");
        
        // Lookup
        System.out.println("LOOKUP: " + cdDatabase.get("76543210"));

    }
    
}
