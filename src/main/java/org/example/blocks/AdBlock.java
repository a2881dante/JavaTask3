package org.example.blocks;

import org.example.factories.PaidTypeFactory;
import org.example.models.Ad;

public class AdBlock extends BroadcastBlock{
    public AdBlock(Ad ad) {
        this.blockInfo = ad;
        this.paidType = PaidTypeFactory.init(PaidTypeFactory.PAID_PER_SECOND);
    }
}
