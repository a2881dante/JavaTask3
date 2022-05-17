package org.example;

import org.example.blocks.AdBlock;
import org.example.blocks.InterviewBlock;
import org.example.blocks.SongBlock;
import org.example.keepers.AdKeeper;
import org.example.keepers.InterviewKeeper;
import org.example.keepers.SongKeeper;

public class App
{
    public static void main( String[] args )
    {
        RadioStation station = RadioStation.getInstance();

        SongKeeper songKeeper = new SongKeeper();
        InterviewKeeper interviewKeeper = new InterviewKeeper();
        AdKeeper adKeeper = new AdKeeper();

        Broadcast broadcast = new Broadcast("Трансляция 1", 6000)
                .addNewBlock(new SongBlock(songKeeper.songs.get(2)))
                .addNewBlock(new AdBlock(adKeeper.ads.get(0)))
                .addNewBlock(new InterviewBlock(interviewKeeper.interviews.get(0)))
                .addNewBlock(new AdBlock(adKeeper.ads.get(1)))
                .addNewBlock(new SongBlock(songKeeper.songs.get(1)));
        station.addBroadcast(broadcast);

        station.run();
        System.out.println("Общая доходность радио станции: " + station.total());
    }
}
