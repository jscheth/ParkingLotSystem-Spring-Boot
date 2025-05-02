package com.cybercitycode.parkinglotsystem.model;

import java.util.List;

public class ParkingLevel {
    private String id;
    private String levelCode;
    private List<ParkingSpot> parkingSpots;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getCurrentAvailabilitySpot() {
        return (int) parkingSpots.stream().filter(ParkingSpot::isAvailable).count();
    }
}
