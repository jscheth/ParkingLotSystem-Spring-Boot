package com.cybercitycode.parkinglotsystem.service;

import com.cybercitycode.parkinglotsystem.model.ParkingLevel;
import com.cybercitycode.parkinglotsystem.model.ParkingSpot;
import com.cybercitycode.parkinglotsystem.model.Vehicle;

import java.util.List;

public class ParkingLotService {
    private static ParkingLotService instance;
    private List<ParkingSpot> parkingSpots;
    private List<ParkingLevel> parkingLevels;

    private ParkingLotService() {}

    public static synchronized ParkingLotService getInstance() {
        if (instance == null) {
            instance = new ParkingLotService();
        }
        return instance;
    }

    public void assignSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        if (parkingSpot.isAvailable()) {
            parkingSpot.assign(vehicle);
        }
    }

    public void freeSpot(ParkingSpot parkingSpot) {
        parkingSpot.unassign();
    }

    public void showAvailability() {
        parkingLevels.forEach(level ->
                System.out.println("Level " + level.getLevelCode() + ": " + level.getCurrentAvailabilitySpot() + " spots available")
        );
    }
}
