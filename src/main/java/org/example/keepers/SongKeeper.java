package org.example.keepers;

import org.example.models.Song;

import java.util.ArrayList;

public class SongKeeper {
    public ArrayList<Song> songs = new ArrayList<>();

    public SongKeeper() {
        songs.add(new Song(192, "Metallica", "Die, Die, My Darling"));
        songs.add(new Song(200, "Poets Of the Fall", "War"));
        songs.add(new Song(210, "Mike Oldfield", "Nuclear"));
        songs.add(new Song(152, "Evanescence", "Fields of Innocence"));
    }
}
