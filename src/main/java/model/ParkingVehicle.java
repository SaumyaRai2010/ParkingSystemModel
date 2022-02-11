package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParkingVehicle {
    private String vehicleNumber;
    private LocalDateTime start;
    private LocalDateTime end;
    private VehicleType vehicleType;

    public ParkingVehicle(String vehicleNumber, LocalDateTime start, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.start = start;
        this.vehicleType=vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return LocalDateTime.now();
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public float getFinalCost() {
        return (this.end.getSecond()-this.start.getSecond())*this.vehicleType.getPerSecondPrice()
                +this.vehicleType.getBasePrice();
    }

}

