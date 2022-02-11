package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParkingLot {
    private Map<String,ParkingVehicle> parkingVehicleMap;

    public ParkingLot() {
        this.parkingVehicleMap = new HashMap<String,ParkingVehicle>();
    }

    public Map<String, ParkingVehicle> getParkingVehicleMap() {
        return parkingVehicleMap;
    }

    public void setParkingVehicleMap(Map<String, ParkingVehicle> parkingVehicleMap) {
        this.parkingVehicleMap = parkingVehicleMap;
    }
}
