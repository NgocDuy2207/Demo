package FuramaResort.Model;

import java.time.LocalDateTime;

public class HouseModel extends FacilityModel{
    private String standardRoom;
    private int numberOfArea;

    public HouseModel(String standardRoom, int numberOfArea) {
        this.standardRoom = standardRoom;
        this.numberOfArea = numberOfArea;
    }

    public HouseModel(String nameService, double areaUse, double costRent, int maxPeople, String time, String standardRoom, int numberOfArea) {
        super(nameService, areaUse, costRent, maxPeople, time);
        this.standardRoom = standardRoom;
        this.numberOfArea = numberOfArea;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfArea() {
        return numberOfArea;
    }

    public void setNumberOfArea(int numberOfArea) {
        this.numberOfArea = numberOfArea;
    }

    @Override
    public String toString() {
        return "HouseModel{" +
                "standardRoom='" + standardRoom + '\'' +
                ", numberOfArea=" + numberOfArea +
                '}';
    }
}

