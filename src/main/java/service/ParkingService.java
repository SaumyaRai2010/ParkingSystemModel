package service;

import controller.ParkingMain;
import model.ParkingLot;
import model.ParkingModelConfig;
import model.ParkingVehicle;
import model.VehicleType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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

        }
        return parkingVehicle;
    }



    public  void showParkingStatus() {
        System.out.println("Parking Status Is As Follows :");
//        if (parkingVehicleList.size()==0) {
//            return;
//        }
//        System.out.println("Bike : Total: "+ ParkingModelConfig.getMaxParking()+" Occupied: "+parkingVehicleList.get(0).size()+" Available: "+(ParkingModelConfig.getMaxParking()-parkingVehicleList.get(0).size()));
//        System.out.println("SUV : Total: "+ ParkingModelConfig.getMaxParking()+" Occupied: "+parkingVehicleList.get(1).size()+" Available: "+(ParkingModelConfig.getMaxParking()-parkingVehicleList.get(1).size()));
//        System.out.println("HatchBack : Total: "+ ParkingModelConfig.getMaxParking()+" Occupied: "+parkingVehicleList.get(2).size()+" Available: "+(ParkingModelConfig.getMaxParking()-parkingVehicleList.get(2).size()));
    }

}
