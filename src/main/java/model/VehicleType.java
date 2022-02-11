package model;

public enum VehicleType {
    BIKE(0,0,25,10),SUV(0,0,50,10),HATCHBACK(0,0,100,10);
    private int parkingSize;
    private int occupied;
    private int basePrice;
    private int perSecondPrice;

    VehicleType(int parkingSize, int occupied, int basePrice, int perSecondPrice) {
        this.parkingSize = parkingSize;
        this.occupied = occupied;
        this.basePrice = basePrice;
        this.perSecondPrice = perSecondPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getPerSecondPrice() {
        return perSecondPrice;
    }

    public void setPerSecondPrice(int perSecondPrice) {
        this.perSecondPrice = perSecondPrice;
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
