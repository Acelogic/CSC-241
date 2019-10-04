/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Interfaces.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author jim
 */
public class PlayList implements Iterable<Song>, Iterator<Song> {

    int start, end; //indexes of first and last song
    // Cursor maintains position of current song
    int cursor;

    // Array to hold Song objects
    Song[] songs;

    public PlayList(int s) {
        // Set the size of the play list array
        songs = new Song[s];

        // Adjust indexes
        start = songs.length;
        end = cursor = -1;  // No songs yet
    }

    public boolean addSong(Song s, int i) {
        // Store song at specified index
        if (i < 0 || i >= songs.length) {
            // index beyond bound of array
            return false;
        }

        if (songs[i] != null) {
            // Song exists in this position
            return false;
        }

        // Add song at index
        songs[i] = s;

        // Adjust indexes
        if (i < start) {
            // New first song
            start = i;
        }

        if (i > end) {
            // New last song
            end = i;
        }
        
        System.out.println("VALUES:" + start + ":" + end +":" + cursor);
        return true;
    }

    @Override
    public boolean hasNext() {
        return cursor < end;
    }
    
    //@Override
    public Song next_old() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        // Adjust cursor
        cursor++;
        // Return song
        return songs[cursor];
    }
    
    
    @Override
    public Iterator<Song> iterator() {
        cursor = -1;
        return this;
    }




    
    
    
    
    
        
    @Override
    public Song next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        // Move cursor to first non-null element
        do {
            cursor++;
        } while (songs[cursor] == null && cursor < end);

        // Return song
        return songs[cursor];
    }

 

}
