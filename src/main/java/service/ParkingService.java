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
        ParkingVehicle parkingVehicle=new ParkingVehicle(vehicleNumber, LocalDateTime.now(), vehicleType);
        parkingVehicleMap.put(vehicleNumber,parkingVehicle);
        vehicleType.setOccupied(vehicleType.getOccupied()+1);
    }

    public ParkingVehicle removeParkingVehicle(String vehicleNumber) {
        if ( !parkingVehicleMap.containsKey(vehicleNumber)) {
            return null;
        }
        ParkingVehicle parkingVehicle= parkingVehicleMap.remove(vehicleNumber);
        parkingVehicle.setEnd(LocalDateTime.now());
        parkingVehicle.getVehicleType().setOccupied(parkingVehicle.getVehicleType().getOccupied()-1);
        return parkingVehicle;
    }

    public  void showParkingStatus() {
        System.out.println("Parking Status Is As Follows :");
        for (VehicleType value : VehicleType.values()) {
            System.out.println(value.name()+" - Total : "+value.getParkingSize()+" Available : "+(value.getParkingSize()-value.getOccupied())+" Occupied : "+value.getOccupied());
        }
        }

    public List<ParkingVehicle> getVehicleByType(VehicleType vehicleType) {
        List <ParkingVehicle> vehicleList =new ArrayList<>();
        for (Map.Entry<String, ParkingVehicle> mapElement : parkingVehicleMap.entrySet()) {
               if (mapElement.getValue().getVehicleType() == vehicleType) {
                   vehicleList.add(mapElement.getValue());
               }
        }
        return  vehicleList;
    }

}
