package org.example.blocks;

import org.example.factories.PaidTypeFactory;
import org.example.models.Interview;

public class InterviewBlock extends BroadcastBlock{
    public InterviewBlock(Interview interview) {
        this.blockInfo = interview;
        this.paidType = PaidTypeFactory.init(PaidTypeFactory.PAID_PER_MINUTE_FLOOR);
    }
}
