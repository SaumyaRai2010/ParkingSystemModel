package service;

import controller.ParkingMain;
import model.ParkingLot;
import model.ParkingModelConfig;
import model.ParkingVehicle;

import java.time.LocalDateTime;
import java.util.List;


public class ParkingService {
     List<ParkingVehicle> parkingVehicleList=ParkingModelConfig.parkingLot.getParkingVehicleList();

     public boolean isParkingSpaceAvailable() {
         if (parkingVehicleList.size()==ParkingModelConfig.getMaxParking()) {
             return false;
         }
         return true;
     }

    public void addParkingVehicle(String vehicleNumber) {

        ParkingVehicle parkingVehicle=new ParkingVehicle(vehicleNumber, LocalDateTime.now());
        parkingVehicleList.add(parkingVehicle);
    }

    public ParkingVehicle removeParkingVehicle() {
          ParkingVehicle parkingVehicle=parkingVehicleList.remove(0);
          return parkingVehicle;
    }

    public  void showParkingStatus() {
        System.out.println("Parking Status Is As Follows :");
        System.out.println("Bike : Total: "+ ParkingModelConfig.getMaxParking()+" Occupied: "+parkingVehicleList.size()+" Available: "+(ParkingModelConfig.getMaxParking()-parkingVehicleList.size()));
    }

}
