package FuramaResort.Model;

public class BookingModel {

    private String idBooking;
    private int startDay;
    private int endDay;
    private String customerCode;
    private String serviceName;
    private String typeOfService;
    public BookingModel(){

    }
    public BookingModel( String idBooking, int startDay, int endDay,
                        String customerCode, String serviceName,
                        String typeOfService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;

    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }
}
