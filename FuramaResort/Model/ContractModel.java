package FuramaResort.Model;

public class ContractModel {
    private int contractNumber;
    private String idBooking;
    private double deposit;
    private double TotalPaymentAmount;
    private String codeCustomer;
    public ContractModel(){

    }

    public ContractModel(int contractNumber, String idBooking, double deposit,
                         double totalPaymentAmount, String codeCustomer) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.deposit = deposit;
        TotalPaymentAmount = totalPaymentAmount;
        this.codeCustomer = codeCustomer;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPaymentAmount() {
        return TotalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        TotalPaymentAmount = totalPaymentAmount;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }
}
