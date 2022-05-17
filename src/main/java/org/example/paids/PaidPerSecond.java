package org.example.paids;

import org.example.models.Model;

public class PaidPerSecond implements PaidType {
    private final static float PRICE = 5.0f;

    @Override
    public float total(Model blockInfo) {
        return blockInfo.getDurationInSeconds()  * PRICE;
    }
}
