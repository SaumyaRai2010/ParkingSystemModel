package model;

public class ParkingModelConfig {
    public static ParkingLot parkingLot=new ParkingLot();
    public static int MAX_PARKING;

    public static int getMaxParking() {
        return MAX_PARKING;
    }

    public static void setMaxParking(int maxParking) {
        MAX_PARKING = maxParking;
    }


}
