package model;

import java.util.ArrayList;
import java.util.List;


public class ParkingLot {
    private List<ParkingVehicle> parkingVehicleList;

    public ParkingLot() {
        this.parkingVehicleList = new ArrayList<>();
    }

//    private static List<model.ParkingVehicle> parkingVehicleList;
//        private static List<model.ParkingVehicle> parkingLot1 = new ArrayList<ParkingVariables>(Collections.nCopies(3, 0));
//    private static HashMap<String, model.ParkingVehicle> parkingLot1 = new HashMap<>();
//    public static HashMap<String, model.ParkingVehicle> getParkingLot1() {
//        return parkingLot1;
//    }
//
//    public static void setParkingLot1(HashMap<String, model.ParkingVehicle> parkingLot1) {
//        model.ParkingLot.parkingLot1 = parkingLot1;
//    }


    public List<ParkingVehicle> getParkingVehicleList() {
        return parkingVehicleList;
    }

    public void setParkingVehicleList(List<ParkingVehicle> parkingVehicleList) {
        this.parkingVehicleList = parkingVehicleList;
    }
}
