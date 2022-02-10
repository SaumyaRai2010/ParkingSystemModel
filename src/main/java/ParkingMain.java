import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParkingMain {

    public static int MAX_PARKING;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Maximum Parking Size ");
        MAX_PARKING=sc.nextInt();
        for ( int i=1;i>0;i++) {
            System.out.println("Please Select Your Choice :");
            System.out.println("1. Show parking status");
            System.out.println("2. Park vehicle");
            System.out.println("3. Unpark vehicle");
            System.out.println("4. Exit");
            int ch= sc.nextInt();
            switch (ch) {
                case 1:
                    ParkingService.showParkingStatus(ParkingModel.getParkingLot1());
                    break;
                case 2:
                    System.out.println("Enter Vehicle Type To Park:");
                    System.out.println("1. Bike");
                    System.out.println("2. SUV");
                    System.out.println("3. HatchBack");
                    int vehicleChoiceToPark= sc.nextInt();
                    ParkingService.parkVehicle(vehicleChoiceToPark,ParkingModel.getParkingLot1());
                    break;
                case 3:
                    System.out.println("Enter Vehicle Type To Unpark:");
                    System.out.println("1. Bike");
                    System.out.println("2. SUV");
                    System.out.println("3. HatchBack");
                    int vehicleChoiceToUnpark= sc.nextInt();
                    ParkingService.unparkVehicle(vehicleChoiceToUnpark,ParkingModel.getParkingLot1());
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.printf("Please select a valid choice");

            }
        }


    }
}
