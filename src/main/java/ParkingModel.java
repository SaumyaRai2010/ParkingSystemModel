import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class ParkingModel {
    ParkingVariables parkingVariables;

    //    private static List<ParkingVariables> parkingLot1 = new ArrayList<ParkingVariables>(Collections.nCopies(3, 0));
    private static HashMap<String, ParkingVariables> parkingLot1 = new HashMap<>();
    public static HashMap<String, ParkingVariables> getParkingLot1() {
        return parkingLot1;
    }

    public static void setParkingLot1(HashMap<String, ParkingVariables> parkingLot1) {
        ParkingModel.parkingLot1 = parkingLot1;
    }

}
