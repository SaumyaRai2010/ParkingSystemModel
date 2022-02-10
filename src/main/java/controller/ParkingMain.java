package controller;

import model.ParkingLot;
import model.ParkingModelConfig;
import model.ParkingVehicle;
import service.ParkingService;

import java.util.Scanner;

public class ParkingMain {

    static ParkingService parkingService=new ParkingService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Maximum Parking Size ");
        ParkingModelConfig.setMaxParking(sc.nextInt());
        for ( int i=1;i>0;i++) {
            System.out.println("Please Select Your Choice :");
            System.out.println("1. Show parking status");
            System.out.println("2. Park vehicle");
            System.out.println("3. Unpark vehicle");
            System.out.println("4. Exit");
            int ch= sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    parkingService.showParkingStatus();
                    break;
                case 2:
                    if (!parkingService.isParkingSpaceAvailable() ) {
                        System.out.println("Parking is full");
                    }
                    else {
                        System.out.println("Enter Vehicle Number");
                        String vehicleNumber=sc.nextLine();
                        parkingService.addParkingVehicle(vehicleNumber);
                    }
                    break;

                case 3:
                    ParkingVehicle parkingVehicle = parkingService.removeParkingVehicle();
                    System.out.println("Vehicle number was : "+parkingVehicle.getVehicleNumber());
                    System.out.println("Entry time : "+parkingVehicle.getStart());
                    System.out.println("Exit time : "+parkingVehicle.getEnd());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.printf("Please select a valid choice");

            }
        }


    }
}
