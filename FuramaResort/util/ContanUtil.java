package FuramaResort.util;

public interface ContanUtil {
    enum Gender{
        Male,
        Female
    }
    enum Degree{
        Intermediate, // trung cấp
        University,
        College,
        MastersDegree, // cao hoc
    }
    enum PositionID {
        Receptionist,
        Waiter,
        Monitoring, // giám sát
        Manager,
        Director
    }
    enum TypeCustomer{
        Diamond,
        Platinum,
        Gold,
        Silver,
        Member
    }
    interface pathFile{
        String Employee = "Java/src/FuramaResort/data/employeeCSV";
        String Customer = "Java/src/FuramaResort/data/customerCSV";

    }
}
