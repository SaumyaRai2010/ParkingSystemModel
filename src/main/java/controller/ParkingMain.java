package controller;

import model.ParkingLot;
import model.ParkingModelConfig;
import model.ParkingVehicle;
import model.VehicleType;
import service.ParkingService;

import java.util.Scanner;
import java.util.Vector;

//todo ticket show : base price+ per second charge*(end time-start time) ceil value

//todo show all vehicles list
public class ParkingMain {

    static ParkingService parkingService=new ParkingService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Maximum Parking Size ");
        int parkingSize=sc.nextInt();
        VehicleType.BIKE.setParkingSize(parkingSize);
        VehicleType.SUV.setParkingSize(parkingSize);
        VehicleType.HATCHBACK.setParkingSize(parkingSize);
        sc.nextLine();
        while(true) {
            System.out.println("Please Select Your Choice :");
            System.out.println("1. Show parking status");
            System.out.println("2. Park vehicle");
            System.out.println("3. Unpark vehicle");
            System.out.println("4. Exit");
            int ch= sc.nextInt();
            int vehicleType;
            sc.nextLine();
            switch (ch) {
                case 1:
                    parkingService.showParkingStatus();
                    break;
                case 2:
                    System.out.println("Which Vehicle You Want To Add?");
                    for (VehicleType value : VehicleType.values()) {
                        System.out.println(value.name());
                    }
                    vehicleType=sc.nextInt();
                    sc.nextLine();
                    if ( !parkingService.isParkingSpaceAvailable(VehicleType.values()[vehicleType-1]) ) {
                        System.out.println("Parking is full");
                    }
                    else {

                        System.out.println("Enter Vehicle Number");
                        String vehicleNumber=sc.nextLine();
                        parkingService.addParkingVehicle(vehicleNumber,VehicleType.values()[vehicleType-1]);
                    }
                    break;

                case 3:
                    for (VehicleType value : VehicleType.values()) {
                        System.out.println(value.name());
                    }
                    vehicleType=sc.nextInt();
                    sc.nextLine();
                    if ( parkingService.isParkingSpaceEmpty(VehicleType.values()[vehicleType-1]) ) {
                        System.out.println("Parking Empty Already");
                        break;
                    }
                    ParkingVehicle parkingVehicle = parkingService.removeParkingVehicle(VehicleType.values()[vehicleType-1]);
//                    System.out.println("Vehicle number was : "+parkingVehicle.getVehicleNumber());
//                    System.out.println("Entry time : "+parkingVehicle.getStart());
//                    System.out.println("Exit time : "+parkingVehicle.getEnd());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.printf("Please select a valid choice");

            }
        }


    }
}
