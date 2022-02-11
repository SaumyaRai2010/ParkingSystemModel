package model;

public enum VehicleType {
    BIKE(0,0),SUV(0,0),HATCHBACK(0,0);
    private int parkingSize;
    private int occupied;

    VehicleType(int parkingSize, int occupied) {
        this.parkingSize = parkingSize;
        this.occupied = occupied;
    }

    public int getParkingSize() {
        return parkingSize;
    }

    public void setParkingSize(int parkingSize) {
        this.parkingSize = parkingSize;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }
}
