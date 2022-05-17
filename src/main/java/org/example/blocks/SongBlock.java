package org.example.blocks;


import org.example.factories.PaidTypeFactory;
import org.example.models.Song;

public class SongBlock extends BroadcastBlock{
    public SongBlock(Song song) {
        this.blockInfo = song;
        this.paidType = PaidTypeFactory.init("");
    }
}
