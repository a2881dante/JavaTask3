package org.example.blocks;

import org.example.models.Model;
import org.example.paids.PaidType;

public abstract class BroadcastBlock {
    protected Model blockInfo;

    protected PaidType paidType;

    public Model getBlockInfo() {
        return blockInfo;
    }

    public float total() {
        return paidType == null ? 0 : paidType.total(blockInfo);
    }

    public void run() {
        System.out.println("-- " + blockInfo.toString());
    }

    public boolean isPaid() {
        return paidType == null;
    }
}
