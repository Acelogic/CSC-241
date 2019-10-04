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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song s1 = new Song("Happy Together", "Turtles", 180);
        Song s2 = new Song("Happy", "Pharrell", 240);
        
        // Create play list and add songs
        PlayList p1 = new PlayList(5);
        System.out.println(p1.addSong(s2, 0));
        System.out.println(p1.addSong(s1, 1));
        System.out.println(p1.addSong(s2, 4));
        
        // Iterate through playlist
        for(Song s : p1) { // Uses built-in itertor!
            System.out.println("Playing: " + s);
        }
        
        
        
    }
    
}
