import java.util.List;


public class ParkingService {

    public static void showParkingStatus(List<Integer> parkingLot1) {
        System.out.println("Parking Status Is As Follows :");
        System.out.println("Bike : Total: "+ ParkingMain.MAX_PARKING+" Occupied: "+parkingLot1.get(0)+" Available: "+(ParkingMain.MAX_PARKING-parkingLot1.get(0)));
        System.out.println("SUV : Total: "+ParkingMain.MAX_PARKING+" Occupied: "+parkingLot1.get(1)+" Available: "+(ParkingMain.MAX_PARKING-parkingLot1.get(1)));
        System.out.println("HatchBack : Total: "+ParkingMain.MAX_PARKING+" Occupied: "+parkingLot1.get(2)+" Available: "+(ParkingMain.MAX_PARKING-parkingLot1.get(2)));
    }

    public static void parkVehicle(int vehicleChoiceToPark,List<Integer> parkingLot1) {
        int value=parkingLot1.get(vehicleChoiceToPark-1);
        if (value == ParkingMain.MAX_PARKING ) {
            System.out.println("No More Space Available to park");
            return;
        }
        parkingLot1.set(vehicleChoiceToPark - 1, value + 1);

    }

    public static void unparkVehicle(int vehicleChoiceToUnpark,List<Integer> parkingLot1) {
        int value=parkingLot1.get(vehicleChoiceToUnpark-1);
        if (value == 0) {
            System.out.println("Parking Space is Already Empty");
            return;

        }
        parkingLot1.set(vehicleChoiceToUnpark-1,value-1);


    }
}
