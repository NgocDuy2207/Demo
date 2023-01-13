package FuramaResort.Service;

import FuramaResort.Model.EmployeeModel;

public interface Employee extends  ServiceInterface{
    void edit(String name, EmployeeModel employeeModel);
}
