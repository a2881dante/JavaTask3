package org.example;

import org.example.blocks.BroadcastBlock;

import java.util.ArrayList;

public class Broadcast {
    private int maxDurationInSeconds;

    private int paidDurationInSeconds;

    private int totalDuration;

    private String title;

    private ArrayList<BroadcastBlock> blocks;

    public Broadcast(String title, int maxDurationInMinutes) {
        this.title = title;
        this.blocks = new ArrayList<>();
        this.maxDurationInSeconds = maxDurationInMinutes * 60;
        this.totalDuration = 0;
        this.paidDurationInSeconds = 0;
    }

    public Broadcast addNewBlock(BroadcastBlock broadcastBlock) {
        int blockDuration = broadcastBlock.getBlockInfo().getDurationInSeconds();
        if(
            (totalDuration + blockDuration > maxDurationInSeconds) ||
            (broadcastBlock.isPaid() && ((paidDurationInSeconds + blockDuration) > (maxDurationInSeconds / 2)))
        ) {
            return this;
        }
        this.blocks.add(broadcastBlock);
        totalDuration += blockDuration;
        paidDurationInSeconds += broadcastBlock.isPaid() ? blockDuration : 0;
        return this;
    }

    public float total() {
        float total = 0;
        for(BroadcastBlock block: blocks){
            total += block.total();
        }
        return total;
    }

    public void run() {
        System.out.printf("- Запуск трансляции '%s'\n", title);
        for(BroadcastBlock block: blocks){
            block.run();
        }
    }
}
