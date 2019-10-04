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
public class PlayingCard implements Comparable{

        // Instance variables
    Suit suit;
    Value value;
    
    @Override
    public int compareTo(Object o) {
        PlayingCard other = (PlayingCard)o;
        // Compare
        if (this.value.compareTo(other.value) > 0) {
            return 1;
        } else if (this.value.compareTo(other.value) < 0) {
            return -1;
        } else {
            // Values are equal
            if (this.suit.compareTo(other.suit) > 0) {
                return 1;
            } else if (this.suit.compareTo(other.suit) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    
    @Override
    public String toString(){
        return value.name() + " of " + suit.name();
    }
    
}
