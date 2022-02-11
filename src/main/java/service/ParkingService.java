package service;

import controller.ParkingMain;
import model.ParkingLot;
import model.ParkingModelConfig;
import model.ParkingVehicle;
import model.VehicleType;

import java.time.LocalDateTime;
import java.util.Map;


public class ParkingService {
    Map<String,ParkingVehicle> parkingVehicleMap=ParkingModelConfig.parkingLot.getParkingVehicleMap();

    public boolean isParkingSpaceEmpty(VehicleType vehicleType) {
        if ( vehicleType.getOccupied()!=0) {
            return false;
        }
        return true;
    }

     public boolean isParkingSpaceAvailable(VehicleType vehicleType) {
        if ( vehicleType.getOccupied()==vehicleType.getParkingSize()) {
            return false;
        }
         return true;
     }

    public void addParkingVehicle(String vehicleNumber,VehicleType vehicleType) {
        ParkingVehicle parkingVehicle=new ParkingVehicle(vehicleNumber, LocalDateTime.now(), vehicleType.name());
        parkingVehicleMap.put(vehicleNumber,parkingVehicle);
        vehicleType.setOccupied(vehicleType.getOccupied()+1);
    }

    public ParkingVehicle removeParkingVehicle(VehicleType vehicleType) {
        ParkingVehicle parkingVehicle = null;
        for (Map.Entry mapElement : parkingVehicleMap.entrySet()) {
            String key = (String) mapElement.getKey();
            if (parkingVehicleMap.get(key).getVehicleType() == vehicleType.name()) {
                parkingVehicle = parkingVehicleMap.get(key);
                break;
            }
            vehicleType.setOccupied(vehicleType.getOccupied()-1);
        }

        return parkingVehicle;
    }



    public  void showParkingStatus() {
        System.out.println("Parking Status Is As Follows :");

        }
}
