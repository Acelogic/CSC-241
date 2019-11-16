/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Hashmaps.Demo1;

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
        // Declare hashmap
        HashMap<String, String> myMap = new HashMap();

        myMap.put("Happy", "Smile");
        myMap.put("Sad", "Frown");

      //System.out.println("GET: " + myMap.get("Mad"));
        System.out.println("SIZE: " + myMap.size());

        // Show all keys
        for(String k: myMap.keySet()) {
            System.out.println("KEY: " + k);
        }
        
        System.out.println("REMOVE 1:" + myMap.remove("Mad"));
        System.out.println("REMOVE 2:" + myMap.remove("Happy", "Frown"));
        System.out.println("REMOVE 3:" + myMap.remove("Happy", "Smile"));

        System.out.println("SIZE AFTER REMOVE: " + myMap.size());
        
        

    }

}
