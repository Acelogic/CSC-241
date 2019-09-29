package Coursework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayList implements Iterator {
    private int plSize;
    private ArrayList<Song> songs = new ArrayList<>(plSize);
    private int currentSong;
    private int firstSong;
    private int lastSong;

    public PlayList(int plSize){
        this.plSize = plSize;
    }

    @Override
    public boolean hasNext() {
        boolean isSong = false;
        if(!songs.isEmpty()) {
        isSong = true;
        }
        return isSong;
    }

    @Override
    public Object next() {
        currentSong++;
        return (Object) songs.get(currentSong);
    }

    @Override
    public void remove() {
        songs.remove(songs.get(currentSong-1));

    }

    public void add(Song song){
        songs.add(song);
    }
}
