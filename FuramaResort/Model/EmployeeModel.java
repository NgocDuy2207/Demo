package FuramaResort.Model;

import FuramaResort.util.ContanUtil;
import FuramaResort.util.ContanUtil.Degree;
import FuramaResort.util.ContanUtil.PositionID;

public class EmployeeModel extends PersonModel {
    private Degree degree;
    private PositionID positionID;
    private double salary;

    public EmployeeModel(Degree degree, PositionID positionID, double salary) {
        this.degree = degree;
        this.positionID = positionID;
        this.salary = salary;
    }

    public EmployeeModel(String name, String dayOfBirth, ContanUtil.Gender gender, int idCard,
                         int numberPhone, String email, Degree degree,
                         PositionID positionID, double salary) {
        super(name, dayOfBirth, gender, idCard, numberPhone, email);
        this.degree = degree;
        this.positionID = positionID;
        this.salary = salary;
    }



    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public PositionID getPositionID() {
        return positionID;
    }

    public void setPositionID(PositionID positionID) {
        this.positionID = positionID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getName()+","+
                this.getDayOfBirth()+","+
               this.getGender()+","+
                this.getIdCard()+","+
                this.getNumberPhone()+","+
                this.getEmail()+","+
               degree +","+
                positionID +","+
                salary +"\n"
                ;
    }
}
