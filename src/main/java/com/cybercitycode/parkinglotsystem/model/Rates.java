package com.cybercitycode.parkinglotsystem.model;

public enum Rates {
    HOURLY(5), 
    DAILY(30), 
    WEEKLY(150), 
    MONTHLY(599);

    private final int rate;

    Rates(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
