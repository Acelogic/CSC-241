/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Interfaces.ComparableInterface;

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
        
        PlayingCard pc1 = new PlayingCard();
        pc1.value = Value.ACE;
        pc1.suit = Suit.DIAMONDS;
        
        System.out.println("PC1: " + pc1);
        
         PlayingCard pc2 = new PlayingCard();
        pc2.value = Value.SEVEN;
        pc2.suit = Suit.SPADES;
        
        System.out.println("PC2: " + pc2);
        
        System.out.println("COMPARETO: " + pc1.compareTo(pc2));
        
    }
    
}
