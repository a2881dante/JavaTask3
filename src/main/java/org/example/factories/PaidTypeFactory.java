package org.example.factories;

import org.example.paids.PaidPerMinuteFloor;
import org.example.paids.PaidPerSecond;
import org.example.paids.PaidType;

public class PaidTypeFactory {
    public static final String PAID_PER_MINUTE_FLOOR = "ppmf";
    public static final String PAID_PER_SECOND = "pps";

    private static PaidPerMinuteFloor paidPerMinuteFloor;
    private static PaidPerSecond paidPerSecond;

    public static PaidType init(String paidType) {
        switch (paidType) {
            case PAID_PER_MINUTE_FLOOR:
                if(paidPerMinuteFloor == null) {
                    paidPerMinuteFloor = new PaidPerMinuteFloor();
                }
                return paidPerMinuteFloor;
            case PAID_PER_SECOND:
                if(paidPerSecond == null) {
                    paidPerSecond = new PaidPerSecond();
                }
                return paidPerSecond;
            default:
                return null;
        }
    }
}
