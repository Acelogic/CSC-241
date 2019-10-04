/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Interfaces.Iterator;

/**
 *
 * @author jim
 */
public class Song {

    // Instance variables
    String title, artist;
    int duration;

    // Constructor
    public Song(String t, String a, int d) {
        title = t;
        artist = a;
        duration = d;
    }
    
    // String representation
    @Override
    public String toString(){
        return title + " by " + artist + " (" + duration + " seconds)";
    }

}
