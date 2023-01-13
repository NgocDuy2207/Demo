package FuramaResort.Model;

import java.time.LocalDateTime;

public class RoomModel extends FacilityModel{
    private String facilityFree;

    public RoomModel(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public RoomModel(String nameService, double areaUse, double costRent, int maxPeople, String time, String facilityFree) {
        super(nameService, areaUse, costRent, maxPeople, time);
        this.facilityFree = facilityFree;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    @Override
    public String toString() {
        return "RoomModel{" +
                "facilityFree='" + facilityFree + '\'' +
                '}';
    }
}
