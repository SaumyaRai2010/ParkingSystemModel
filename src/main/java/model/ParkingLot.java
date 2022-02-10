package model;

import java.util.ArrayList;
import java.util.List;


public class ParkingLot {
    private List<ParkingVehicle> parkingVehicleList;

    public ParkingLot() {
        this.parkingVehicleList = new ArrayList<>();
    }
    public List<ParkingVehicle> getParkingVehicleList() {
        return parkingVehicleList;
    }

    public void setParkingVehicleList(List<ParkingVehicle> parkingVehicleList) {
        this.parkingVehicleList = parkingVehicleList;
    }
}
