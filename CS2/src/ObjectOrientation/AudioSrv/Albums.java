package ObjectOrientation.AudioSrv;

import java.util.ArrayList;

public class Albums {

    public ArrayList<String> songs;
    public String artist;

    public Albums(String artist, ArrayList songs){
        this.songs = songs;
        this.artist = artist;
    }
}
