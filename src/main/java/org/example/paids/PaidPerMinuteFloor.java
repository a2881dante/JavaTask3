package org.example.paids;

import org.example.models.Model;

public class PaidPerMinuteFloor implements PaidType {
    private static final float PRICE = 30.0f;

    @Override
    public float total(Model blockInfo) {
        return (float)Math.floor(blockInfo.getDurationInSeconds() / 60) * PRICE;
    }
}
