package model;

import java.time.LocalDateTime;

public class ParkingVehicle {
    private String vehicleNumber;
    private LocalDateTime start;
    private LocalDateTime end;

    public ParkingVehicle(String vehicleNumber, LocalDateTime start) {
        this.vehicleNumber = vehicleNumber;
        this.start = start;
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


}
