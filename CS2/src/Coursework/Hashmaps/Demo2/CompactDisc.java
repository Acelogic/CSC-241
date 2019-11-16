/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Hashmaps.Demo2;

/**
 *
 * @author jearly
 */
public class CompactDisc {
    // Instance variables
    private String upc;
    private double price;
    private String artist, title;
    
    public CompactDisc(String u, double p, String a, String t){
        upc = u;
        price = p;
        artist = a;
        title = t;
    }
    
    public String getUpc(){
        return upc;
    }
    
    // ToString
    @Override
    public String toString(){
        return "\nUPC:" + upc + "\nARTIST:" + artist +
                "\nTITLE:" + title + "\nPRICE:" + price;
    }
}
