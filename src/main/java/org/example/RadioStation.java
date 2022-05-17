package org.example;

import org.example.blocks.BroadcastBlock;

import java.util.ArrayList;

public class RadioStation {
    private static RadioStation radioStation;
    private ArrayList<Broadcast> broadcasts;

    private RadioStation() {
        this.broadcasts = new ArrayList<>();
    }

    public static RadioStation getInstance() {
        if(radioStation == null) {
            radioStation = new RadioStation();
        }
        return radioStation;
    }

    public ArrayList<Broadcast> getBroadcasts(){
        return this.broadcasts;
    }

    public void addBroadcast(Broadcast broadcast) {
        broadcasts.add(broadcast);
    }

    public float total() {
        float total = 0;
        for(Broadcast broadcast: broadcasts){
            total += broadcast.total();
        }
        return total;
    }

    public void run() {
        for(Broadcast broadcast: broadcasts){
            System.out.println("Радиостанция начинает вещание");
            broadcast.run();
        }
    }
}
