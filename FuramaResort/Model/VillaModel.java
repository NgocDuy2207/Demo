package FuramaResort.Model;

import java.time.LocalDateTime;

public class VillaModel extends FacilityModel {
    private String standardRoom;
    private double poolArea;
    private int numberOfFloor;

    public VillaModel(String standardRoom, double poolArea, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public VillaModel(String nameService, double areaUse, double costRent, int maxPeople, String time, String standardRoom, double poolArea, int numberOfFloor) {
        super(nameService, areaUse, costRent, maxPeople, time);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "VillaModel{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}





