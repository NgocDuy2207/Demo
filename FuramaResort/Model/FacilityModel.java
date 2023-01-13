package FuramaResort.Model;

import java.time.LocalDateTime;

public abstract class FacilityModel {
    private String nameService;
    private double areaUse;
    private double costRent;
    private int maxPeople;
    private String time;

    public FacilityModel() {
    }

    public FacilityModel(String nameService, double areaUse, double costRent, int maxPeople, String time) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.costRent = costRent;
        this.maxPeople = maxPeople;
        this.time = time;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FacilityModel{" +
                "nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", costRent=" + costRent +
                ", maxPeople=" + maxPeople +
                ", time='" + time + '\'' +
                '}';
    }
}



